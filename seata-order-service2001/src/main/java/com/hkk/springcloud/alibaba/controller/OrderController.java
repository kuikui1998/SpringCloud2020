package com.hkk.springcloud.alibaba.controller;

import com.hkk.springcloud.alibaba.domain.CommonResult;
import com.hkk.springcloud.alibaba.domain.Order;
import com.hkk.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

/**
 * @auther kuikui
 * @create 2020-09-05 11:52
 */
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
