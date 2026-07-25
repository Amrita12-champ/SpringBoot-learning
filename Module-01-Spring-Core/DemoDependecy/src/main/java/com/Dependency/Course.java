package com.Dependency;

public class Course {
    private int c_id;
    private String course_name;

    public Course(int c_id, String course_name) {
        this.c_id = c_id;
        this.course_name = course_name;
    }

    public String toString() {
        return "Course{" + "c_id=" + c_id + ", course_name='" + course_name + '\'' + '}';
    }

}

