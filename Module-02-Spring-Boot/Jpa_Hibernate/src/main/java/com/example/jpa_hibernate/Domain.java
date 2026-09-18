package com.example.jpa_hibernate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Domain {

    @Id
    private int id;
    private String name;

    // One Domain has Many Projects
    @OneToMany(mappedBy = "domain", cascade = CascadeType.ALL)
    private List<Project> projects = new ArrayList<>();

    public Domain() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}