package com.cognizant.java.entity;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	private String studentName;
	private int age;
	private double parttimeSalary;
	
	  @OneToMany(targetEntity = Course.class,cascade = CascadeType.ALL)
	  @JoinColumn(name="student_course_fk",referencedColumnName = "studentId")
	  private List<Course> courses;
	  
	 
}
