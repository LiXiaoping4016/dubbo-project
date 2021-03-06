package com.producer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 生产者启动类
 *
 * @Author lixp23692
 * @Date 2020.04.03
 */
@SpringBootApplication
@EnableDubbo
public class ProducerStarter {
    public static void main(String[] args) {
        SpringApplication.run(ProducerStarter.class, args);
    }
}
