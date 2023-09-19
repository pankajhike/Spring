package com.Spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class auto {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autoConfig.xml");
        Emp emp = context.getBean(Emp.class,"emp");
        System.out.println(emp);
    }
}
