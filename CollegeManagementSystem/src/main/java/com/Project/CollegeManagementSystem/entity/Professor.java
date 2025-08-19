package com.Project.CollegeManagementSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.Set;


@Entity
@Getter
@Setter
@Table
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String title;

    @OneToMany(mappedBy = "professor")
    private List<Subject> subjects;

    @ManyToMany(mappedBy = "professors")
    private Set<Student> students;





}
