package com.example.mapping;

import jakarta.persistence.*;


@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int e_id;
    String e_name;

//@OneToOne(mappedBy = "e")
//    Department d;
    @ManyToOne
    Department d;

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public Department getD() {
        return d;
    }

    public void setD(Department d) {
        this.d = d;
    }
    //    public Department getD() {
//        return d;
//    }
//
//    public void setD(Department d) {
//        this.d = d;
//    }
}
