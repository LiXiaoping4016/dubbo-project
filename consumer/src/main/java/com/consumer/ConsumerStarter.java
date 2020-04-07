package com.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 消费者启动类
 *
 * @Author lixp23692
 * @Date 2020.04.03
 */
@SpringBootApplication
@EnableDubbo
public class ConsumerStarter {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerStarter.class, args);
    }
}
