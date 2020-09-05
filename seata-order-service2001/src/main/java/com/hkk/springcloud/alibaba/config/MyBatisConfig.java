package com.hkk.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @auther kuikui
 * @create 2020-09-05 11:54
 */

@Configuration
@MapperScan({"com.hkk.springcloud.alibaba.dao"})
public class MyBatisConfig {

}