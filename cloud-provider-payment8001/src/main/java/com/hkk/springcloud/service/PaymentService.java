package com.hkk.springcloud.service;

import com.hkk.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @auther kuikui
 * @create 2020-08-08 19:29
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
