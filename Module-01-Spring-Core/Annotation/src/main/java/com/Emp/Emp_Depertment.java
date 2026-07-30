package com.Emp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("e_dept")
public class Emp_Depertment {

    private int d_id = 43;
    private String d_name = "ST";

    public Emp_Depertment() {

    }
    public String toString() {
        return "Department ID: " + d_id +
                ", Department Name: " + d_name;
    }
}