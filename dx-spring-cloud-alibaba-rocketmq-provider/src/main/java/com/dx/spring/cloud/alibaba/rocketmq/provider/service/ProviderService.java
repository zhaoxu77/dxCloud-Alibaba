package com.dx.spring.cloud.alibaba.rocketmq.provider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2019-01-23 14:47
 **/
@Service
public class ProviderService {
    //@Autowired
    //private MessageChannel output;

    /*public void send(String message) {
        output.send(MessageBuilder.withPayload(message).build());
    }*/

    @Autowired
    private MySource source;

    public void send(String msg) throws Exception {
        source.output1().send(MessageBuilder.withPayload(msg).build());
    }

    public void send2(String msg) throws Exception {
        source.output2().send(MessageBuilder.withPayload(msg).build());
    }
}
