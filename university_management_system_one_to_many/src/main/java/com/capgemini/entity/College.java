package com.capgemini.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // One College -> Many Departments
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "college_id") // FK in department table
    private List<Department> departments;

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}