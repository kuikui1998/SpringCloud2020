package com.hkk.springcloud.alibaba.service;

import com.hkk.springcloud.entities.CommonResult;
import com.hkk.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @auther kuikui
 * @create 2020-09-03 14:05
 */

@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}

