package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ReplaceXML.class);


        Employee e1 = (Employee) context.getBean("e2");


        e1.job();
    }
}