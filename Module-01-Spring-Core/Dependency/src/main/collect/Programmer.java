package com.demo.collect;

import java.util.List;

public class Programmer {
    private int id;
    private String name;
    private List<String> tech;


    public Programmer(int id, String name, List<String> tech) {
        this.id = id;
        this.name = name;
        this.tech = tech;
    }


    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<String> getTech() { return tech; }
    public void setTech(List<String> tech) { this.tech = tech; }

    @Override
    public String toString() {
        return "Developer [id=" + id + ", name=" + name + ", tech=" + tech + "]";
    }
}