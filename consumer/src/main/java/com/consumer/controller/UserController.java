package com.consumer.controller;

import com.consumer.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户服务控制器
 *
 * @Author lixp23692
 * @Date 2020.04.07
 */
@RestController
public class UserController {
    @Reference(version = "${provider.service.version}", loadbalance = "roundrobin")
    private IUserService userService;

    @GetMapping("/getUserInfo/{id}")
    public String getUserInfo(@PathVariable(name = "id") String id) {
        return userService.getUserInfo(id);
    }
}
