package com.techlabs.calisthenics;

public class NoIfTest {

	public static void main(String[] args) {
		
		String username="admin";
		
		if(!isValid(username))
		{
			System.out.println("Stop");
			return;
		}
		
	    System.out.println("Go ahead");
		

	}

	private static boolean isValid(String username) {
		if(username!="admin")
			return false;
	
	   return true;
	}

}
