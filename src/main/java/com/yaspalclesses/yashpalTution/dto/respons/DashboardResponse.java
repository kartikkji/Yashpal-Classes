package com.yaspalclesses.yashpalTution.dto.respons;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class DashboardResponse {

    private StudentDto studentDto;
    private Integer totalAttendance;
    private double averageMarks;

}

