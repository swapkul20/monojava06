package com.techlabs.hibernet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techlabs.hibernet.dao.StudentDao;
import com.techlabs.hibernet.entity.Student;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private StudentDao studentDao;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		//createStudent(studentDao);
		//getStudents(studentDao );
		//getStudentByRno(studentDao);
		
		updateStudent(studentDao);
		
	}
	
	private void updateStudent(StudentDao studentDao2) {
		
		Student student=getStudentByRno(studentDao2);
		
		student.setAge(50);
	
		studentDao2.updateStudent(student);
		
		System.out.println("Updated succesfully");
		
	}

	private Student getStudentByRno(StudentDao studentDao2) {
		Student student=studentDao.getStudentByRollNumber(2);
		//System.out.println(student);
		return student;
		
	}

	private void getStudents(StudentDao studentDao) {
		
      List<Student> students=studentDao.getAllStudents();
      
      for(Student student:students)
    	  System.out.println(student);
		
	}

	private void createStudent(StudentDao studentDao)
	{
	
		Student student=new Student("Swapnil","swap@gmail.com",34);
		studentDao.save(student);
	}

}
