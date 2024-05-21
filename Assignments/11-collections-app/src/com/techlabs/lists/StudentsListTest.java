package com.techlabs.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsListTest {

	public static void main(String[] args) {
		
		
		List<Student> students=new ArrayList<Student>();
		
		students.add(new Student(11,"Neelu","neelu@gmail.com"));
		students.add(new Student(31,"Sai","sohan@gmail.com"));
		students.add(new Student(21,"Sohan","sai@gmail.com"));
		
		
		
		
		for(Student student:students)
			System.out.println(student);
		
		Collections.sort(students, new StudentsByRollNumber());
		
		System.out.println("Students Sorted By Roll Number");
		
		for(Student student:students)
			System.out.println(student);
		
Collections.sort(students, new StudentsByName());
		
		System.out.println("Students Sorted By Name");
		
		for(Student student:students)
			System.out.println(student);
		

	}

}
