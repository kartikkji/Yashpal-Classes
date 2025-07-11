package com.yaspalclesses.yashpalTution.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "teacher")

public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String email;

    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private Subject subject;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
    private List<Notes> notes;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
    private List<Lecture> lectures;


}
