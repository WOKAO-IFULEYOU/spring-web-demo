package com.beyond.spring.web.demo.web.controller;

import com.beyond.spring.web.demo.commons.SpringContext;
import com.beyond.spring.web.demo.service.UserService;
import com.beyond.spring.web.demo.service.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//这里不能用@Controller注解，因为这个类继承了HttpServlet
public class LoginController extends HttpServlet {

    public static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    /*
    * @Autowired
    * UserServiceImpl userService；
    *
    * 这里不能用@Autowired注解的原因不太明白，所以只好装配SpringContext工具类
    * 在SpringContext工具类中，获取ApplicationContext.getBean()方法，来获取bean实例
    */
    UserServiceImpl userService = SpringContext.getBean("userService");

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("我来了");
        userService.sayHi();
        logger.info("我走了");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
