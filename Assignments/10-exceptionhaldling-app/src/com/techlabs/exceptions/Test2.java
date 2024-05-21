package com.techlabs.exceptions;

public class Test2 {

	public static void main(String[] args) {
		
		try
		{
	
		System.out.println("Exception Handling is fun");
		
		throw(new NullPointerException());
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception thrown explicitly");
		}

	}

}


