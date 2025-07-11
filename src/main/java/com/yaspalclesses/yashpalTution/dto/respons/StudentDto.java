package com.yaspalclesses.yashpalTution.dto.respons;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private String studentName;
    private String profilePhoto;
    private String className;
}
