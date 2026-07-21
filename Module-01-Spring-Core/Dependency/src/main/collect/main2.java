package com.demo.collect;
import com.demo.collect.Programmer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main2 {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Programmer dev = (Programmer) context.getBean("c1");

        // Display output utilizing the injected field variables via getters
        System.out.println("Developer ID: " + dev.getId());
        System.out.println("Developer Name: " + dev.getName());
        System.out.println("Technologies: " + dev.getTech());
    }
}