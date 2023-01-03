package com.cognizant.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.java.entity.Student;
import com.cognizant.java.service.StudentService;
@RestController
@RequestMapping(value="/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping(value="/test")
	public String test() {
		return "hello testd application";
		
	}
	
	@PostMapping(value="/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		Student student1=studentService.saveStudentDetails(student);
		return new ResponseEntity<>(student1,HttpStatus.CREATED);
	}
	@GetMapping(value="/findAll")
	public ResponseEntity<Student> findAllStudent(){
		List<Student> allStudents=studentService.findAllStudentDetails();
		return new ResponseEntity(allStudents,HttpStatus.OK);
		
	}
	

}
