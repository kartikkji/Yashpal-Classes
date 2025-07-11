package com.yaspalclesses.yashpalTution.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "test")
public class Test {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer totalMarks;

    private Integer score;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    private LocalDate date;
}
