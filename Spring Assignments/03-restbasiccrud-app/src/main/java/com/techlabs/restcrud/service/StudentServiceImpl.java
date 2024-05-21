package com.techlabs.restcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.restcrud.entity.Student;
import com.techlabs.restcrud.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public List<Student> getAllStudents() {


		return studentRepo.getAllStudents();
	}

	@Override
	public void saveStudent(Student student) {
	
		studentRepo.saveStudent(student);
		System.out.println("Student Record Inserted");
		
	}

}
