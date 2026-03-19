package com.capgemini.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // One University -> Many Colleges
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "university_id") // FK in college table
    private List<College> colleges;

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<College> getColleges() {
        return colleges;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColleges(List<College> colleges) {
        this.colleges = colleges;
    }
}