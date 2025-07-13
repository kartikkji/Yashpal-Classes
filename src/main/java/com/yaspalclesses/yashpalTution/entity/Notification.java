package com.yaspalclesses.yashpalTution.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String message;

    private ClassName className;

    final Boolean isActive = true;

    private LocalDate createdAt;


}

