package com.example.Student.Information;

import com.example.Student.Information.entity.Student;
import com.example.Student.Information.repository.StudentRepository;
import org.hibernate.annotations.NaturalId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentInformationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentInformationApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Raj", "Kumar", "raj@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Rahul", "Kumar", "rahul@hotmail.com");
//		studentRepository.save(student2);
	}
}
