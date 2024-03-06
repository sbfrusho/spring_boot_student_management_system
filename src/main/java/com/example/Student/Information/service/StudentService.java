package com.example.Student.Information.service;

import com.example.Student.Information.entity.Student;
import com.example.Student.Information.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface StudentService {

    public List<Student> getAllStudents();
    public Student getStudentById(Long id);

}
