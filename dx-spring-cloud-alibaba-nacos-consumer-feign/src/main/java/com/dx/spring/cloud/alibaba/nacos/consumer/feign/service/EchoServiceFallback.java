package com.dx.spring.cloud.alibaba.nacos.consumer.feign.service;

import org.springframework.stereotype.Component;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2019-01-22 14:52
 **/
@Component
public class EchoServiceFallback implements EchoService {
    @Override
    public String echo(String message) {
        return "echo fallback";
    }
}