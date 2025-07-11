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
@Table(name = "lecture")
public class Lecture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher;

    @Column(nullable = false)
    private String videoUrl;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ClassName className;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false)
    private String topic;

    @Column(nullable = false, length = 1000)
    private String description;
}