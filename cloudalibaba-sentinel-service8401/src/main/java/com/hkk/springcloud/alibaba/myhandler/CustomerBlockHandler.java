package com.hkk.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.hkk.springcloud.entities.CommonResult;
import com.hkk.springcloud.entities.Payment;

/**
 * @auther kuikui
 * @create 2020-09-01 10:04
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(444,"按客户自定义,global handlerException-----1");
    }

    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(444,"按客户自定义,global handlerException-----2");
    }

}
