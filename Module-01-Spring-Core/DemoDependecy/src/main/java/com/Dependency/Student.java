package com.Dependency;

public class Student {
    private int id;
    private String name;
    private Course c;
     public Student(int id, String name, Course c){
         this.id=id;
         this.name=name;
         this.c=c;
     }

     public String toString(){
         return "Student{ " + "id "+ id+"name "+name+"course "+c+  "}";
     }

}
