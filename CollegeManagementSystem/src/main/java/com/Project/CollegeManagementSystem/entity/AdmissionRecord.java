package com.Project.CollegeManagementSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Entity
@Getter
@Setter
@Service
@Table(name = "admission_record")
public class AdmissionRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Integer fees;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id",nullable = false)
    private Student student;

}
