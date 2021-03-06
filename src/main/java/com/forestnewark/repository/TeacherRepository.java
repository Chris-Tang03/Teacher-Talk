package com.forestnewark.repository;


import com.forestnewark.bean.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

    List<Teacher> findAllByEmail(String email);

    Teacher findByEmail(String email);
}
