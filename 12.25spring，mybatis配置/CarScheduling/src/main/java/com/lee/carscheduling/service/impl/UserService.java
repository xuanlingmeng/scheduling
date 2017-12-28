package com.lee.carscheduling.service.impl;

import com.lee.carscheduling.dao.UserDao;
import com.lee.carscheduling.model.User;
import com.lee.carscheduling.service.IUserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserService implements IUserService {

    @Resource
    private UserDao userdao;

    public User getUserByID(int id) {
        return this.userdao.selectByPrimaryKey(id);
    }
}
