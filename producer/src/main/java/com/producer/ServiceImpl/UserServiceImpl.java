package com.producer.ServiceImpl;

import com.consumer.IUserService;

/**
 * 用户服务
 *
 * @Author lixp23692
 * @Date 2020.04.03
 */
public class UserServiceImpl implements IUserService {
    public String getUserInfo(String id) {
        if ("1".equals(id)) {
            return "马云";
        } else if ("2".equals(id)) {
            return "小花";
        } else {
            return "未找到该用户......";
        }
    }
}
