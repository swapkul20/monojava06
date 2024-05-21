package com.techlabs.restcrud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="rollnumber")
	private int rollnumber;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="age")
	private String age;
	
	public Student() {
		
	}

	public Student(int rollnumber, String name, String email, String age) {
	
		this.rollnumber = rollnumber;
		this.name = name;
		this.email = email;
		this.age = age;
	}
	
	

	public Student(String name, String email, String age) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	
	
	

}
