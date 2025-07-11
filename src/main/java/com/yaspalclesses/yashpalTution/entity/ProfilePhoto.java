package com.yaspalclesses.yashpalTution.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "profile_photo")
public class ProfilePhoto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "profile_image")
    private String url;

    @OneToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;


}
