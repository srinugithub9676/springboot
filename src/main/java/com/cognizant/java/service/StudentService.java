package com.cognizant.java.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cognizant.java.entity.Student;

@Component
public interface StudentService {

	Student saveStudentDetails(Student student);

	List<Student> findAllStudentDetails();



}
