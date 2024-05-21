package com.techlabs.jpacrud.exception;

public class StudentNotFoundException extends RuntimeException{
	
	public StudentNotFoundException()
	{
		
	}
	
	public String getMessage()
	{
		return "Student Not Found";
	}

}
