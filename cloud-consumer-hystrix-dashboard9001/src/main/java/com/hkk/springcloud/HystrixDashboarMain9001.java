package com.hkk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @auther kuikui
 * @create 2020-08-12 14:41
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboarMain9001 {
    public static void main(String[] args) {
            SpringApplication.run(HystrixDashboarMain9001.class,args);
        }
}
