package com.hkk.springcloud.alibaba.service.impl;

import com.hkk.springcloud.alibaba.dao.OrderDao;
import com.hkk.springcloud.alibaba.domain.Order;
import com.hkk.springcloud.alibaba.service.AccountService;
import com.hkk.springcloud.alibaba.service.OrderService;
import com.hkk.springcloud.alibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @auther kuikui
 * @create 2020-09-05 11:26
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;
    @Resource
    private AccountService accountService;
    @Resource
    private StorageService storageService;

    @Override
    public void create(Order order) {
        //1新建订单
        log.info("----->开始新建订单");
        orderDao.create(order);

        //2扣减库存
        log.info("----->订单微服务开始调用库存，做扣减Count");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("----->订单微服务开始调用库存，做扣减end");

        //3扣减账户
        log.info("----->订单微服务开始调用账户，做扣减Money");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("----->订单微服务开始调用账户，做扣减end");

        //4修改订单的状态，从零到1，1代表已完成
        log.info("------->修改订单状态开始");
        orderDao.update(order.getUserId(),0);
        log.info("------->修改订单状态结束");

        log.info("---->下订单结束了，O(∩_∩)O~");

        //....
    }
}
