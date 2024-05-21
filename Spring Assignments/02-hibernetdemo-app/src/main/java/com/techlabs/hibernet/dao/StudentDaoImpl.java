package com.techlabs.hibernet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.hibernet.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	private EntityManager manager;
	

	@Override
	@Transactional
	public void save(Student student) {
		
		manager.persist(student);
		System.out.println("Record inserted successfully");
	
		
	}


	@Override
	public List<Student> getAllStudents() {
		
	TypedQuery<Student> query=manager.createQuery("select s from Student s",Student.class);
		
	return query.getResultList();
	}


	@Override
	public Student getStudentByRollNumber(int rollnumber) {

     TypedQuery<Student> query=manager.createQuery("select s from Student s where s.rollnumber=:theRno",Student.class);
     query.setParameter("theRno",rollnumber);
     
     Student temp=null;
     
     try
     {
    	 temp=query.getSingleResult();
     }
     catch(Exception e)
     {
    	 System.out.println("Record not found");
     }
     
		return temp;
	}


	@Override
	@Transactional
	public Student updateStudent(Student student) {
		
		return manager.merge(student);
		
	
	}

}
