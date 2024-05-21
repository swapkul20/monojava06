package com.techlabs.jpacrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.techlabs.jpacrud.entity.Student;
import com.techlabs.jpacrud.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepo.findAll();
	}

	@Override
	public Student save(Student student) {
	
		return studentRepo.save(student);
	}

	@Override
	public Student update(Student student) {
		

		
		return studentRepo.save(student);
	}

	@Override
	public void delete(int rollnumber) {

       Optional<Student> student=studentRepo.findById(rollnumber);
       
       if(student.isPresent())
    	   studentRepo.delete(student.get());
       
       
       //studentRepo.deleteById(rollnumber);
		
	}

	@Override
	public Student getStudent(int rollnumber) {

	 Optional<Student> dbStudent=studentRepo.findById(rollnumber);
	 
	 Student student=null;
	 
     if(dbStudent.isPresent())
  	   student=dbStudent.get();
     
     return student;
	 
	}

	@Override
	public Page<Student> getStudentByName(int pagenumber,int pagesize,String name) {
		
		Pageable pageable=PageRequest.of(pagenumber, pagesize);
		
		return studentRepo.findByName(name, pageable);
	}

	@Override
	public Page<Student> getStudentsPageWise(int pagenumber, int pagesize) {
	
		Pageable pageable=PageRequest.of(pagenumber, pagesize);
		return studentRepo.findAll(pageable);
	}



}
