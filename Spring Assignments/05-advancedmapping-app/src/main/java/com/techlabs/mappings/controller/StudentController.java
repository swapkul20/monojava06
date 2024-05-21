package com.techlabs.mappings.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techlabs.mappings.entity.Student;
import com.techlabs.mappings.service.StudentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/studentapp")
@Slf4j
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	private static final Logger log=LoggerFactory.getLogger(StudentController.class);
	
	@PostMapping("/students")
	public ResponseEntity<Student> addStudent(@RequestBody Student student)
	{
		studentService.save(student);
		
		log.info("Student Inserted Successfully");
		
		return ResponseEntity.ok(student);
	}

}
