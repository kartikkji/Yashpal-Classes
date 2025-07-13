package com.yaspalclesses.yashpalTution.repo;


import com.yaspalclesses.yashpalTution.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
//    Optional<Student> findById(Integer id);

}
