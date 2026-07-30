package com.Emp;

public class Employee {
    private int e_id;
    private String e_name;
    private Emp_Depertment e_dept;

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public void setE_dept(Emp_Depertment e_dept) {
        this.e_dept = e_dept;
    }

    public String toString() {
        return "Employee ID = " + e_id +
                "\nEmployee Name = " + e_name +
                "\n" + "Employee Cource: "+ e_dept;
    }

}
