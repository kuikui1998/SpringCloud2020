package com.hkk.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @auther kuikui
 * @create 2020-08-10 16:55
 */
@Service
public class PaymentService {

    /**
     * 正常访问，肯定OK
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id){
        return "线程池:    "+Thread.currentThread().getName()+"paymentInfo_OK,id:  "+id+"\t"+"O(∩_∩)O哈哈";
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")
    })
    public String paymentInfo_TimeOut(Integer id){
        try {//暂停几秒钟
            TimeUnit.MILLISECONDS.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池:    "+Thread.currentThread().getName()+"paymentInfo_TimeOut,id:  "+id+"\t"+"O(∩_∩)O"
                + "     耗时秒";
    }

    public String paymentInfo_TimeOutHandler(Integer id){
        return "线程池:    "+Thread.currentThread().getName()+"系统繁忙或运行报错，请稍后再试,id:  "+id+"\t"+"(T_T)";
    }

}
