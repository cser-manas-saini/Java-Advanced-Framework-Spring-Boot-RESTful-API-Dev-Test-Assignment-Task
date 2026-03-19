package com.capgemini.entity;

import jakarta.persistence.*;

@Entity
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "college_id")
    private College college;

    public Long getId() { return id; }
    public String getName() { return name; }
    public College getCollege() { return college; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setCollege(College college) { this.college = college; }
}