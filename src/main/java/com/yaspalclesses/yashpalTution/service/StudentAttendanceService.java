package com.yaspalclesses.yashpalTution.service;

import com.yaspalclesses.yashpalTution.dto.respons.AttendanceDto;
import com.yaspalclesses.yashpalTution.entity.Attendance;
import com.yaspalclesses.yashpalTution.repo.StudentAttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentAttendanceService {

    @Autowired
    private StudentAttendanceRepository studentAttendanceRepository;

    public List<AttendanceDto> findByStudentId(Integer studentId){

        List<Attendance> allAttendances = studentAttendanceRepository.findByStudentId(studentId);

        List<AttendanceDto> presentAttendance = allAttendances.stream()
                .filter(attendance -> attendance.getPresent()) // only present
                .map(attendance -> new AttendanceDto(attendance.getDate()))
                .collect(Collectors.toList());

        return presentAttendance;
    }
}
