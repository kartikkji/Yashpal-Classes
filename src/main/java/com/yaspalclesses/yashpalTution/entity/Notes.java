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
@Table(name = "notes")
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "notes_url", nullable = false)
    private String notesUrl;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ClassName className;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher;


}
