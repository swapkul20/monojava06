package com.techlabs.restcrud.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.restcrud.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
	
	@Autowired
	private EntityManager manager;

	@Override
	public List<Student> getAllStudents() {
		
		TypedQuery<Student> query= manager.createQuery("select s from Student s",Student.class);
	
		return query.getResultList();
	}

	@Override
	@Transactional
	public void saveStudent(Student student) {
		
	       manager.persist(student);
	       
	     
	}

}
