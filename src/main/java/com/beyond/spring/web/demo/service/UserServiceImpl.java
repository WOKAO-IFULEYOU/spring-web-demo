package com.beyond.spring.web.demo.service;

import org.springframework.stereotype.Service;

//注入bean到容器，指定beanId为"userService"
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    public void sayHi() {
        System.out.println("hello springweb");
    }
}
