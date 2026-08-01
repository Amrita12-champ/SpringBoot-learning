package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.example")
public class ReplaceXML {

@Bean("e2")
    public Employee e1() {
        return new Employee(100, getAddress());
    }
@Bean
    public Address getAddress() {
        return new Address("Bhubaneswar","Odisha");
    }
}

