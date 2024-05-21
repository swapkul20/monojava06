package com.techlabs.lists;

public class Student {
	
	private int rollnumber;
	private String name;
	private String email;
	
	public Student(int rollnumber, String name, String email) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.email = email;
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

	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", email=" + email + "]";
	}
	

}
