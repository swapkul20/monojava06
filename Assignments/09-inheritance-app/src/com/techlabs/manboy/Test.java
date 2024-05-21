package com.techlabs.manboy;

public class Test {
	
	public static void main(String args[])
	{
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		
		try    // it monitors for an exception
		{
		   double c=a/b; // creates an object of that exception type and will throw -> ArithmeticException
		
		   System.out.println(c);
		}
	    catch(ArithmeticException e)
		{
	    	System.out.println("You can not divide by zero. Please check inputs");
			
		}
		
		
		System.out.println("Bye");
	}

}
