package com.lee.scheduling.service;

import com.lee.scheduling.dao.IUserDao;
import com.lee.scheduling.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")

public class UserServiceImpl implements UserService {
    //自动注入iuserdao 用于访问数据库
    @Autowired
    IUserDao Mapper;

    //登录方法的实现,从jsp页面获取username与password
    public boolean login(String username, String password) {
//        System.out.println("输入的账号:" + username + "输入的密码:" + password);
        //对输入账号进行查询,取出数据库中保存对信息
        User user = Mapper.selectByName(username);
        if (user != null) {
//            System.out.println("查询出来的账号:" + user.getUsername() + "密码:" + user.getPassword());
//            System.out.println("---------");
            if (user.getUsername().equals(username) && user.getPassword().equals(password))
                return true;

        }
        return false;

    }
}