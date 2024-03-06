package com.example.Student.Information.entity;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "First Name")
    private String firstName;

    @Column(name = "Last Name")
    private String lastName;

    @Column(name = "Email")
    private String email;

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Student() {

    }
}
