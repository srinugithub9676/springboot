package com.cognizant.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.java.entity.Student;



@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
