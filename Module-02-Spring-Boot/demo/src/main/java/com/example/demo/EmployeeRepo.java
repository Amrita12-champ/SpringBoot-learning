package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
    List<Employee> findByName(String name);               //find by name

    List<Employee> findByAddress(String address);         //find by address

    List<Employee> findByNameLike(String name);           //find record with names starting letter

    List<Employee> findByIdGreaterThan(Integer id);       //find all id greater than 4 or 4 or like this

    List<Employee> findByIdLessThan(Integer id);          //find all id less than a perticular number

    List<Employee> findByIdBetween(int idAfter, int idBefore);  //find all ides between two give ids

    List<Employee> findByNameEndingWith (String name);      //find by name that ending with some charchert(given)

    List<Employee> findByNameContaining(String name);        //find by name that constain some charcter

    List<Employee> findByIdIn(List<Integer> id);             //find if the ids are present or not

    List<Employee> findByNameNot(String name);         //find the record where name is not "Amrita"...etc

    List<Employee> findByNameAndAddress(String name, String address);

    List<Employee> findByNameOrAddress(String name, String address);



    List<Employee> findByAddressIsNotNull(); //show record where address is not null


    List<Employee> findByAddressIsNull(); //check null address

//    @Query("select e from Employee e where name=a")
//    int updateData(@Param("a") int id, @Param("e") String name);









}
