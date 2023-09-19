package com.Spring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ciTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ciConfig.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person.toString());


        Addition add = (Addition) context.getBean("add");
        add.doSum();
    }
}
