package com.techlabs.restcrud.repository;

import java.util.List;

import com.techlabs.restcrud.entity.Student;

public interface StudentRepository {
	
	List<Student> getAllStudents();
	
	void saveStudent(Student student);

}
