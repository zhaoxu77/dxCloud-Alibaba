package com.dx.spring.cloud.alibaba.rocketmq.consumer.receive;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2019-01-23 15:22
 **/
@Service
public class ConsumerReceive {

    /*@StreamListener("input")
    public void receiveInput(String message) {
        System.out.println("Receive input: " + message);
    }*/

    @StreamListener("input1")
    public void receiveInput1(String receiveMsg) {
        System.out.println("input1 receive: " + receiveMsg);
    }

    @StreamListener("input2")
    public void receiveInput2(String receiveMsg) {
        System.out.println("input2 receive: " + receiveMsg);
    }

}
