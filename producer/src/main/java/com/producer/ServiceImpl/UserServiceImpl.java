package com.producer.ServiceImpl;

import com.consumer.IUserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 用户服务
 *
 * @Author lixp23692
 * @Date 2020.04.03
 */
@Service(version = "${provider.service.version}")
@Component
public class UserServiceImpl implements IUserService {
    @Value("${server.port}")
    String port;

    @Value("${spring.application.name}")
    String appName;

    public String getUserInfo(String id) {
        String result;
        if ("1".equals(id)) {
            result = "马云";
        } else if ("2".equals(id)) {
            result = "小花";
        } else {
            result = "未找到该用户......";
        }
        return result + " , From " + appName + " : " + port;
    }
}
