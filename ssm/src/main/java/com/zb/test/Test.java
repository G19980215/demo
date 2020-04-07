package com.zb.test;

import com.zb.entity.User;
import com.zb.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        UserService bean = context.getBean(UserService.class);
        User admin = bean.findUserLogin("admin", "123");
        System.out.println(admin.getNickname());
    }
}
