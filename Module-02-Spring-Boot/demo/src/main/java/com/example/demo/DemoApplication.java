package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	ApplicationContext ioc= SpringApplication.run(DemoApplication.class, args);
	EmployeeRepo er= ioc.getBean(EmployeeRepo.class);

//	Employee e1=new Employee();
//	e1.setId(11);
//	e1.setName("Pratyusha");
//	er.save(e1); //insert data to database

//		Iterable<Employee>allEmployee =er.findAll(); //show all tables data
//		allEmployee.forEach(empData->{
//			System.out.println(empData);
//		});

//		Optional<Employee>oneData=er.findById(10);
//		System.out.println(oneData.get());

//		Optional<Employee>oneData=er.findById(10);
//		Employee updateData=oneData.get();
//		updateData.setName("Dev");
//		er.save(updateData); //update data

		//er.deleteById(11); //delete

//		long x=er.count(); //count record
//		System.out.println(x);


//		boolean y=er.existsById(12);
//		System.out.println(y); //search if exist


	}

}
