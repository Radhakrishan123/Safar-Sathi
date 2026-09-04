package com.example.demo;

import com.example.loose.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    static void main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        GreetingService greetingService= (GreetingService) context.getBean("myBean");
        greetingService.sayhello();
        UserService us = (UserService) context.getBean("userService");
        us.notifyUser("Order placed");

    }
}
