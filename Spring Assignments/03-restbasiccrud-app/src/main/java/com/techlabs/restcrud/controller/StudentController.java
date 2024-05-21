package com.techlabs.restcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techlabs.restcrud.entity.Student;
import com.techlabs.restcrud.service.StudentService;

@RestController
@RequestMapping("/studentapp")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	List<Student> getAllStudents()
	{
	     return studentService.getAllStudents();	
	}
	
	@PostMapping("/addstudent")
	void saveStudent(@RequestBody Student student)
	{
		studentService.saveStudent(student);
	}

}
