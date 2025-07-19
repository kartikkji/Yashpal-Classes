package com.yaspalclesses.yashpalTution.repo;

import com.yaspalclesses.yashpalTution.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentAttendanceRepository extends JpaRepository<Attendance, Integer> {

    List<Attendance> findByStudentId(Integer studentId);

}
