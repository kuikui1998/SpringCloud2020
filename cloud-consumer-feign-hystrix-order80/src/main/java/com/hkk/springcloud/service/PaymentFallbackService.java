package com.hkk.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @auther kuikui
 * @create 2020-08-12 11:17
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,┭┮﹏┭┮";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,┭┮﹏┭┮";
    }
}
