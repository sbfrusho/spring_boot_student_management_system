package com.example.Student.Information.service;

import com.example.Student.Information.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getAllStudents();

    Student saveStudent(Student student);

}
