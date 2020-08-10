package com.hkk.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @auther kuikui
 * @create 2020-08-10 13:51
 */
public interface LoadBalance {

    ServiceInstance instance(List<ServiceInstance> serviceInstances);

}
