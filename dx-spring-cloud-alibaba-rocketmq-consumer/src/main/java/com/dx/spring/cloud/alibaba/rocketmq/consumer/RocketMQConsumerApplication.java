package com.dx.spring.cloud.alibaba.rocketmq.consumer;

import com.dx.spring.cloud.alibaba.rocketmq.consumer.receive.MySink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2019-01-23 15:21
 **/
@SpringBootApplication
@EnableBinding({MySink.class})
public class RocketMQConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RocketMQConsumerApplication.class, args);
    }
}
