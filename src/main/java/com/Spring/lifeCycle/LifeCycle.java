package com.Spring.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycle {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifeConfig.xml");
//        Samosa s1 = (Samosa) context.getBean("s1");
//        System.out.println(s1);

        context.registerShutdownHook();

//        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
//        Pepsi pepsi = (Pepsi) context.getBean("pepsi");
//        System.out.println(pepsi);

        Example example = (Example) context.getBean("example");
        System.out.println(example);
    }
}
