package com.yaspalclesses.yashpalTution.controller;


import com.yaspalclesses.yashpalTution.dto.respons.StudentDashboardResponse;
import com.yaspalclesses.yashpalTution.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentDashboardController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/dashboard/{id}")
    public ResponseEntity<StudentDashboardResponse> getDashboardData(@PathVariable Integer id) {
        StudentDashboardResponse response = studentService.getDashboardData(id);
        return ResponseEntity.ok(response);
    }

}
