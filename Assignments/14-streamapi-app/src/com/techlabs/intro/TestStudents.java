package com.techlabs.intro;

import java.util.Arrays;
import java.util.List;

public class TestStudents {

	public static void main(String[] args) {


		List<Student> students=Arrays.asList(new Student(2,"Dharam","d@gmail.com",15),
				                             new Student(1,"Ayushi","a@gmail.com",18)
				                             ,new Student(3,"Sanjay","s@gmail.com",19));
		
		
		System.out.println("All students:");
		students.stream().forEach(student -> System.out.println(student));
		
		System.out.println("Students eleigible to vote:");
		
		students.stream().filter(student -> student.getAge()>=18)
		                 .forEach(student->System.out.println(student));
		
		

	}

}
