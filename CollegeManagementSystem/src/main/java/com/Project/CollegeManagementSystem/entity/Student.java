package com.Project.CollegeManagementSystem.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Service
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(
            name = "student_professor", // Name of the join table
            joinColumns = @JoinColumn(name = "student_id"), // Foreign key for the Student entity
            inverseJoinColumns = @JoinColumn(name = "professor_id") // Foreign key for the Professor entity
    )
    private Set<Professor> professors;

    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name = "student_subject",
            joinColumns = @JoinColumn(name = "student_id", nullable = false)
            ,inverseJoinColumns = @JoinColumn(name = "subjects_id"))
    private Set<Subject> subjects;





}
