package com.techlabs.hibernet.dao;

import java.util.List;

import com.techlabs.hibernet.entity.Student;

public interface StudentDao {
	
	void save(Student student); // save student record
	
	List<Student> getAllStudents();  // fetch all records
	
	Student getStudentByRollNumber(int rollnumber); // 
	
	Student updateStudent(Student student);

}
