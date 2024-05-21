package com.techlabs.mappings.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.mappings.entity.Student;
import com.techlabs.mappings.repository.StudentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	private static final Logger log=LoggerFactory.getLogger(StudentServiceImpl.class);

	@Override
	public Student save(Student student) {
		
		if(student.getName()==null)
		{
			throw new NullPointerException();
		}
		
		Student dbStudent=studentRepository.save(student);
		if(dbStudent==null)
			log.error("Student Not inserted");
		else
			log.info("Student saved successfully");
		
		return dbStudent;
	}

}
