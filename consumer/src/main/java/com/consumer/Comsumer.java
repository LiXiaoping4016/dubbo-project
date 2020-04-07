package com.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 消费者
 *
 * @Author lixp23692
 * @Date 2020.04.03
 */
public class Comsumer {
    public static void getUserInfoById() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("dubbo.xml");
        applicationContext.start();
        System.out.println("###消费者开始调用生产者服务");
        IUserService userService = (IUserService) applicationContext.getBean("userService");
        String userName = userService.getUserInfo("1");
        System.out.println("###消费者结束调用生产者服务,userName:" + userName);
    }

    public static void main(String[] args) {
        getUserInfoById();
    }

}
