package com.Dependency;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("data.xml");

        Student s = (Student) context.getBean("s1");
        System.out.println(s);
    }
}