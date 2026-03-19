package com.capgemini.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private List<Project> projects;

    public Long getId() { return id; }
    public String getName() { return name; }
    public List<Project> getProjects() { return projects; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setProjects(List<Project> projects) { this.projects = projects; }
}