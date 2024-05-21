package com.techlabs.jpacrud.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.techlabs.jpacrud.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student save(Student student);
	Student update(Student student);
	void delete(int rollnumber);
	
	Student getStudent(int rollnumber);
	
	Page<Student> getStudentByName(int pageno,int pagesize,String name);
	
	Page<Student> getStudentsPageWise(int pagenumber,int pagesize);
	


}
