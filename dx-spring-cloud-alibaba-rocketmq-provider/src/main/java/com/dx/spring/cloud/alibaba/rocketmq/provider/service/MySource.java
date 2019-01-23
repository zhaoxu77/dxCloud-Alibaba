package com.dx.spring.cloud.alibaba.rocketmq.provider.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2019-01-23 16:09
 **/
public interface MySource {
    @Output("output1")
    MessageChannel output1();

    @Output("output2")
    MessageChannel output2();
}
