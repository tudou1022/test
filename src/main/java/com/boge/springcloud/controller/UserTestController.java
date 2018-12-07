package com.boge.springcloud.controller;

import com.boge.springcloud.bean.User;
import com.boge.springcloud.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @Author zhangwenbo
 * @DATE 2018/12/6 - 14:54
 * @Description:
 */
@RestController
@RequestMapping(value = "/user/test")
public class UserTestController {

    @Autowired
    UserRepository userDao;

    @RequestMapping(value = "/search/{id}")
    public User getUserById(@PathVariable Long id){
        return userDao.getOne(id);
    }
}
