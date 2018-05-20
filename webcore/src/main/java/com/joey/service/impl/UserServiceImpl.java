package com.joey.service.impl;

import com.joey.dao.IUserDao;
import com.joey.model.User;
import com.joey.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;
    @Override
    public User getUserById(int userId) {
        // TODO Auto-generated method stub
//        return this.userDao.selectByPrimaryKey(userId);
        return new User();
    }


}
