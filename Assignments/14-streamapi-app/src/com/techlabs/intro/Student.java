package com.techlabs.intro;

public class Student {
	
	private int rollnumber;
	private String name;
	private String email;
	private int age;
	public Student(int rollnumber, String name, String email, int age) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.email = email;
		this.age=age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	}


	

}
