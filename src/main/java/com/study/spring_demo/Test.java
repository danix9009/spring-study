package com.study.spring_demo;

import com.study.spring_demo.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title
 * @Author hdan
 * @Since 2021/12/30
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User)ctx.getBean("user");
        user.setName("uu");
        user.setId(18L);
        System.out.println(user);
    }
}
