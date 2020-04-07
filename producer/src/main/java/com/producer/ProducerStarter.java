package com.producer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 生产者启动类
 *
 * @Author lixp23692
 * @Date 2020.04.03
 */
public class ProducerStarter {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("dubbo.xml");
        applicationContext.start();
        System.out.println("生产者启动成功...");
        System.in.read();
    }
}
