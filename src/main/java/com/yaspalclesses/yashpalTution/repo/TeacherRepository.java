package com.yaspalclesses.yashpalTution.repo;


import com.yaspalclesses.yashpalTution.entity.ClassName;
import com.yaspalclesses.yashpalTution.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

    Teacher findByClassName(ClassName className);
}
