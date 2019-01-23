package com.dx.spring.cloud.alibaba.rocketmq.consumer.receive;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2019-01-23 16:10
 **/
public interface MySink {
    @Input("input1")
    SubscribableChannel input1();

    @Input("input2")
    SubscribableChannel input2();

    /*@Input("input3")
    SubscribableChannel input3();

    @Input("input4")
    SubscribableChannel input4();*/
}
