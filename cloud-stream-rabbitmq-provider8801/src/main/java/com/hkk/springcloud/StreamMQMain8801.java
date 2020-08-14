package com.hkk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @auther kuikui
 * @create 2020-08-14 10:50
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMQMain8801 {

    public static void main(String[] args) {
            SpringApplication.run(StreamMQMain8801.class,args);
        }
}
