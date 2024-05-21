package com.techlabs.restcrud.service;

import java.util.List;

import com.techlabs.restcrud.entity.Student;

public interface StudentService {
	
    List<Student> getAllStudents();
	
	void saveStudent(Student student);

}
