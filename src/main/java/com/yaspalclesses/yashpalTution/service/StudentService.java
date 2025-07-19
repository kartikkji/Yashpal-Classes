package com.yaspalclesses.yashpalTution.service;


import com.yaspalclesses.yashpalTution.dto.respons.*;
import com.yaspalclesses.yashpalTution.entity.Attendance;
import com.yaspalclesses.yashpalTution.entity.Student;
import com.yaspalclesses.yashpalTution.entity.Teacher;
import com.yaspalclesses.yashpalTution.repo.StudentAttendanceRepository;
import com.yaspalclesses.yashpalTution.repo.StudentRepository;
import com.yaspalclesses.yashpalTution.repo.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private StudentAttendanceService studentAttendanceService;




    public StudentDashboardResponse getDashboardData(Integer id){

        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));


        StudentDashboardResponse response = new StudentDashboardResponse();
        NotificationDto notificationDto = new NotificationDto();
        FeedbackDto feedbackDto = new FeedbackDto();
        StudentDto studentDto = new StudentDto();
        TeacherDto teacherDto = new TeacherDto();




        // get and set student in student dto;
        studentDto.setStudentName(student.getName());

        if (student.getProfilePhoto() != null) {
            studentDto.setProfilePhoto(student.getProfilePhoto().getUrl());
        }

        studentDto.setClassName(student.getStudentClass().getDisplayName());

        // get the feedback from student.
        if (student.getStudentFeedback() != null) {
            feedbackDto.setFeedback(student.getStudentFeedback().getFeedback());
        } else {
            feedbackDto.setFeedback("Welcome back! Keep pushing forward!");
        }


        // set and get teacher from student.
        Teacher teacher = student.getTeacher();
//        teacher = teacherRepository.findByClassName(student.getStudentClass());

        teacherDto.setName(teacher.getName());

        if(teacher.getProfilePhoto() != null){
            teacherDto.setProfilePhoto(teacher.getProfilePhoto().getUrl());
        }

        teacherDto.setSubject(teacher.getSubject().getDisplayName());

        teacherDto.setPhone(teacher.getPhoneNumber());




        // get all Attendance
        List<AttendanceDto> allAttendances = studentAttendanceService.findByStudentId(student.getId());



        // set all dto in dashboard Dto
        response.setStudentDto(studentDto);
        response.setFeedbackDto(feedbackDto);
        response.setTeacherDto(teacherDto);
        response.setNotificationDto(notificationDto);
        response.setTotalAttendance(allAttendances);


        return response;
    }




}
