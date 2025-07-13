package com.yaspalclesses.yashpalTution.dto.respons;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class StudentDashboardResponse {

    private StudentDto studentDto;
    private TeacherDto teacherDto;
    private NotificationDto notificationDto;
    private Integer totalAttendance;
    private double averageMarks;

}

