package com.perscholas.student_login_demo.repository;

import com.perscholas.student_login_demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByEmail(String email);
}
