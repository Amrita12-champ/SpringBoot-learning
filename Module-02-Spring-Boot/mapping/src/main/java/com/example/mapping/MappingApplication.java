package com.example.mapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MappingApplication {

    public static void main(String[] args) {
       ApplicationContext ioc= SpringApplication.run(MappingApplication.class, args);
       EmployeeRepo er=ioc.getBean(EmployeeRepo.class);
       DepartmentRepo dr=ioc.getBean(DepartmentRepo.class);

       Employee e1=new Employee();
       e1.setE_name("Pratyusha");
       er.save(e1);

       Department d1=new Department();
       d1.setD_id(102);
       d1.setD_name("BPO");
       d1.setE(e1);
       dr.save(d1);



    }

}
