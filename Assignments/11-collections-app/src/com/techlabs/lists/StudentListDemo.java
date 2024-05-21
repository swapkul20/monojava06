package com.techlabs.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentListDemo {

	public static void main(String[] args) {
		
		List<Student> students=new ArrayList<Student>();
		
		students.add(new Student(1,"Sai","sai@gmail.com"));
		students.add(new Student(2,"Ramya","ramya@gmail.com"));
		students.add(new Student(3,"Neelu","neelu@gmail.com"));
		
		System.out.println(students);
		
//		for(int i=0;i<students.size();i++)
//		{
//			System.out.println(students.get(i));
//		}
//		
		for(Student student:students)
		{
			System.out.println(student.getName());
		}
		
		Iterator studentIterator=students.iterator();
		
		while(studentIterator.hasNext())
		{
			Student student=(Student)studentIterator.next();
			System.out.println(student.getName());
		}
//		
		ListIterator<Student> studentListIterator=students.listIterator();
		
		while(studentListIterator.hasNext())
			studentListIterator.next();
		
		while(studentListIterator.hasPrevious())
			System.out.println(studentListIterator.previous().getEmail());

	}

}
