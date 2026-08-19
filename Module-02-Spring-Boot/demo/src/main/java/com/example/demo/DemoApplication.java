package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.hibernate.internal.util.collections.ArrayHelper.forEach;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	ApplicationContext ioc= SpringApplication.run(DemoApplication.class, args);
	EmployeeRepo er= ioc.getBean(EmployeeRepo.class);

//	Employee e1=new Employee();
//	e1.setId(8);
//	e1.setName("Priya");
//	//e1.setAddress();
//	er.save(e1); //insert data to database

//		Iterable<Employee>allEmployee =er.findAll(); //show all tables data
//		allEmployee.forEach(empData->{
//			System.out.println(empData);
//		});

//		Optional<Employee>oneData=er.findById(10);
//		System.out.println(oneData.get());

//		Optional<Employee>oneData=er.findById(11);
//		Employee updateData=oneData.get();
//		updateData.setAddress("Jajpur");
//		er.save(updateData); //update data

		//er.deleteById(11); //delete

//		long x=er.count(); //count record
//		System.out.println(x);


//		boolean y=er.existsById(12);
//		System.out.println(y); //search if exist


//		List<Employee> data=er.findByName("Amrita");
//		data.forEach(x->{
//			System.out.println(x);
//		});


//		List<Employee> address=er.findByAddress("Ctc");
//		address.forEach(x->{
//			System.out.println(x);
//		});


//		List<Employee> names=er.findByNameLike("D%");
//		names.forEach(y->{
//			System.out.println(y);
//		});


//		List<Employee> id=er.findByIdGreaterThan(10);
//		id.forEach(a->{
//			System.out.println(a);
//		});
//

//		List<Employee> ids=er.findByIdLessThan(10);
//		ids.forEach(d->{
//			System.out.println(d);
//		});


//		List<Employee> id=er.findByIdBetween(5, 11);
//		id.forEach(a->{
//			System.out.println(a);
//		});


//		List<Employee> id=er.findByNameEndingWith("a");
//		id.forEach(e->{
//			System.out.println(e);
//		});

//
//		List<Employee>id=er.findByNameNot("Amrita");
//		id.forEach(e->{
//			System.out.println(e);
//		});


//		List<Employee>k=er.findByIdIn(Arrays.asList(1, 3, 5));
//		k.forEach(a->{
//			System.out.println(a);
//		});


//		List<Employee> o = er.findByNameAndAddress("Amrita", "Ctc");
//		o.forEach(x -> {
//			System.out.println(x);
//		});


//		List<Employee> p = er.findByNameOrAddress("Amrita", "Ctc");
//		p.forEach(x -> {
//			System.out.println(x);
//		});

		List<Employee> m = er.findByAddressIsNull();
		m.forEach(x -> {
			System.out.println(x);
		});


		List<Employee> n = er.findByAddressIsNotNull();
		n.forEach(x -> {
			System.out.println(x);
		});










	}

}
