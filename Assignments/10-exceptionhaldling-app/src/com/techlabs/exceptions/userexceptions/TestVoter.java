package com.techlabs.exceptions.userexceptions;

import java.util.Scanner;

public class TestVoter {

	public static void main(String[] args) {
		
		int age;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter age:");
		age=scanner.nextInt();
		
		try
		{
		
		if(age<18)
			throw new AgeNotValidException(age);
		
		System.out.println("Age is valid: You are eligible to vote");
		
		
		}
		catch(AgeNotValidException e)
		{
			System.out.println(e);
		}

	}

}
