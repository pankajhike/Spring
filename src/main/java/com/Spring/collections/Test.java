package com.Spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("CollectionConfig.xml");
    Emp emp1 = (Emp) context.getBean("emp1");
        System.out.println(emp1.getName());
        System.out.println(emp1.getPhone());
        System.out.println(emp1.getAddress());
        System.out.println(emp1.getCourses());
        System.out.println(emp1.getProps());
    }
}
