package com.yaspalclesses.yashpalTution.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "phone_number",unique = true, nullable = false, length = 10)
    private String phoneNumber;

    @Column(nullable = false)
    private String password;

    @Column(name = "student_class", nullable = false)
    @Enumerated(EnumType.STRING)
    private ClassName studentClass;

    @Column(name = "Join_date", nullable = false)
    private LocalDate joinDate;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Column(name = "adders")
    private String adders;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Test> test;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Attendance> attendances;

    @OneToOne(mappedBy = "student" , cascade = CascadeType.ALL)
    private ProfilePhoto profilePhoto;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private StudentFeedback studentFeedback;
}
