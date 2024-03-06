package com.example.Student.Information.controller;

import com.example.Student.Information.entity.Student;
import com.example.Student.Information.service.StudentService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    //handler method to handle list of students and return model and view
    @GetMapping("/students")
    public String getAllStudents(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @PostMapping("/create")
    public String createStudent(Model mode){
        Student student = new Student();
        mode.addAttribute("student", student);
        return "create";
    }
}
