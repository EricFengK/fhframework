package com.fh.controller;

/**
 * Created by Administrator on 2017-09-11.
 */

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fh.model.User;
import com.fh.service.UserService;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/saveUser",
            method = RequestMethod.GET
    )
    @ResponseBody
    public String saveUser(HttpServletRequest request) {
        User user = new User();

        user.setAge(Integer.parseInt(request.getParameter("age")));
        user.setCreateTime(request.getParameter("createTime"));
        user.setLastLoginTime(request.getParameter("lastLoginTime"));
        user.setName(request.getParameter("name"));
        user.setPassword(request.getParameter("password"));
        user.setRealName(request.getParameter("realName"));
        user.setRole(request.getParameter("role"));
        user.setLoginName(request.getParameter("loginName"));
        System.out.println(user.getCreateTime() + "//" + user.getLastLoginTime());
        return userService.add(user);
    }

    @RequestMapping(value = "/addUser",
            method = RequestMethod.GET
    )
    @ResponseBody
    public String add() {
        return userService.addUser();
    }

    @RequestMapping(value = "/user",
            method = RequestMethod.GET
    )
    @ResponseBody
    public User add(Long id) {
        return userService.getOneUser(id);
    }
}

