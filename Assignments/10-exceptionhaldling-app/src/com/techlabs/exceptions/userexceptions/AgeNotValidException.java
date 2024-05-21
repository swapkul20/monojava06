package com.techlabs.exceptions.userexceptions;

public class AgeNotValidException extends Exception{
	
	
	private int age;
	
	public AgeNotValidException(int age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return "AgeNotValidException :"+age+" Age must be greater than 18";
	}

	public String getMessage()
	{
		return "AgeNotValidException :"+age+" Age must be greater than 18";
		
	}
	
	

}
