package com.hkk.springcloud.alibaba.dao;

import com.hkk.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @auther kuikui
 * @create 2020-09-05 11:15
 */
@Mapper
public interface OrderDao
{
    //新建订单
    void create(Order order);

    //修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
