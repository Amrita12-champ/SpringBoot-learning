package com.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("data.xml");

        Employee emp = context.getBean("emp", Employee.class);

        System.out.println(emp);
    }
}