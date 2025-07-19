package com.yaspalclesses.yashpalTution.dto.respons;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class StudentDashboardResponse {

    private StudentDto studentDto;
    private TeacherDto teacherDto;
    private NotificationDto notificationDto;
    private FeedbackDto feedbackDto;
    private List<AttendanceDto> totalAttendance;
    private List<StudentRankingDto> ranks;

}

