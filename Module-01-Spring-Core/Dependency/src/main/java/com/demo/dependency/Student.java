package com.demo.dependency;
public class Student {
    private int id;
    private String name;
    private String course;
    public Student() {
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ']';
    }
}