package com.hkk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @auther kuikui
 * @create 2020-08-13 12:39
 */
@SpringBootApplication
@EnableConfigServer
public class MainAppConfigCenter3344 {

    public static void main(String[] args) {
            SpringApplication.run(MainAppConfigCenter3344.class,args);
        }
}
