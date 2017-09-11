package com.fh.service;

/**
 * Created by Administrator on 2017-09-11.
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fh.dao.UserDao;
import com.fh.model.User;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;

    public String add(User user) {
        userDao.save(user);
        return "添加成功！";
    }

    public String addUser() {
        User user = new User();
        user.setAge(18);
        user.setCreateTime("2017-03-07 00:53:12");
        user.setLastLoginTime("2017-03-07 00:54:12");
        user.setLoginName("zzg");
        user.setName("小周");
        user.setPassword("123456");
        user.setRealName("周*刚");
        user.setRole("一级管理员");
        userDao.save(user);
        return "添加成功！";
    }

    public User getOneUser(Long id) {
        return userDao.findOne(id);
    }
}
