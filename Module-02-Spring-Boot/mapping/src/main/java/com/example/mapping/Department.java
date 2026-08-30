package com.example.mapping;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Department {
    @Id
    int d_id;
    String d_name;

//@OneToOne
    //Employee e;

    @OneToMany(mappedBy = "d")
    List<Employee> allEmployee=new ArrayList<>();

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }


//    public Employee getE() {
//        return e;
//    }
//
//    public void setE(Employee e) {
//        this.e = e;
//    }


    public List<Employee> getAllEmployee() {
        return allEmployee;
    }

    public void setAllEmployee(List<Employee> allEmployee) {
        this.allEmployee = allEmployee;
    }
}
