package com.amrita.fieldinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FieldInjectionApplication implements CommandLineRunner {
    @Autowired
    private PaymentService paymentService;

    public static void main(String[] args) {
        SpringApplication.run(FieldInjectionApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {

        System.out.println(paymentService.makePayment());

    }
}
