package com.demo.dependency;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext ac =
                new ClassPathXmlApplicationContext("data.xml");

        Student s1 = (Student) ac.getBean("s1");

        System.out.println(s1);
    }
}
