package com.perscholas.student_login_demo.service;

import com.perscholas.student_login_demo.dto.StudentDTO;
import com.perscholas.student_login_demo.model.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(StudentDTO studentDto);
    Student findStudentByEmail(String email);
    List<StudentDTO> findAllStudents();
}
