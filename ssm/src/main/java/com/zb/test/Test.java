package com.zb.test;

import com.zb.entity.User;
import com.zb.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //本地开发
        //别人提交的
        //ghj开发了代码
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        UserService bean = context.getBean(UserService.class);
        User admin = bean.findUserLogin("admin", "123");
        System.out.println(admin.getNickname());
    }
}
