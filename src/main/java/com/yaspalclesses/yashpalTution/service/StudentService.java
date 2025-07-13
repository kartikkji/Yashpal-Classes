package com.yaspalclesses.yashpalTution.service;


import com.yaspalclesses.yashpalTution.dto.respons.StudentDashboardResponse;
import com.yaspalclesses.yashpalTution.dto.respons.StudentDto;
import com.yaspalclesses.yashpalTution.entity.Student;
import com.yaspalclesses.yashpalTution.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentDashboardResponse getDashboardData(Integer id){
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));


        StudentDashboardResponse response = new StudentDashboardResponse();

        StudentDto studentDto = new StudentDto();
        studentDto.setStudentName(student.getName());

        if (student.getProfilePhoto() != null) {
            studentDto.setProfilePhoto(student.getProfilePhoto().getUrl());
        }

        studentDto.setClassName(student.getStudentClass().getDisplayName());

        if (student.getStudentFeedback() != null) {
            studentDto.setFeedback(student.getStudentFeedback().getFeedback());
        } else {
            studentDto.setFeedback("Welcome back! Keep pushing forward!");
        }


        return response;
    }




}
