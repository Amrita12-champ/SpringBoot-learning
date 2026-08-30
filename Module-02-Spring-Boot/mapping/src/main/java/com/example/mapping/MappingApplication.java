package com.example.mapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MappingApplication {

    public static void main(String[] args) {
       ApplicationContext ioc= SpringApplication.run(MappingApplication.class, args);
       EmployeeRepo er=ioc.getBean(EmployeeRepo.class);
       DepartmentRepo dr=ioc.getBean(DepartmentRepo.class);

       Employee e1=new Employee();
       Employee e2=new Employee();
       Employee e3=new Employee();
       Department d1=new Department();

//       e1.setE_name("Pratyusha");
//       er.save(e1);

      // Department d1=new Department();
//       d1.setD_id(102);
//       d1.setD_name("BPO");
//       d1.setE(e1);
//       dr.save(d1);

//       //----------------------------------------------------------------bidirection (onetomany-manytoone)---------------------------
//       d1.setD_id(102);
//       d1.setD_name("Mern fullstack");
//       dr.save(d1);
//
//
//       e1.setE_name("Soumyarani");
//       e2.setE_name("Amrita");
//       e3.setE_name("Biswajita");
//
//       e1.setD(d1);
//       e2.setD(d1);
//       e3.setD(d1);
//
//       er.save(e1);
//       er.save(e2);
//       er.save(e3);
//
//       List<Employee> allEmp=new ArrayList<>();
//       allEmp.add(e1);
//       allEmp.add(e2);
//       allEmp.add(e3);
//       d1.setAllEmployee(allEmp);
//       dr.save(d1);
////____________________________________________________________________________________________________________________
//




    }

}
