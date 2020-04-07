package com.zb.controller;

import com.zb.entity.User;
import com.zb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/login")
    public String login(String name , String pwd, HttpSession session){
        User userLogin = userService.findUserLogin(name, pwd);
        session.setAttribute("sys_user",userLogin);
        System.out.println(userLogin.getNickname());
        return "main";
    }
}
