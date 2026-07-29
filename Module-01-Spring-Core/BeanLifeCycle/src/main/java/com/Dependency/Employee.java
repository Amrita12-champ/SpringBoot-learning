package com.Dependency;

public class Employee {
    private int id;
    private String name;
    public Employee(){
        System.out.println("Employee bean Created ");
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init(){
        System.out.println("init method called ");
    }

    public void display(){
        System.out.println("Emp id : "+ id);
        System.out.println("Emp name : "+name);
    }

    public void destroy(){
        System.out.println("destroy method called");
    }
}
