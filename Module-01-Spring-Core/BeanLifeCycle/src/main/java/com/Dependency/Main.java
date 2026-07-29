package com.Dependency;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {

        AbstractApplicationContext ac =
                new ClassPathXmlApplicationContext("beans.xml");


        Employee emp = (Employee) ac.getBean("employee");

        emp.display();


        ac.registerShutdownHook();
    }
}