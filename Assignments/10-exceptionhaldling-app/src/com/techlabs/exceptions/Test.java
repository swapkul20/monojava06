package com.techlabs.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {
	
	public static void main(String args[]) throws FileNotFoundException 
	{
		try    // it monitors for an exception
		{
		
		    
		    FileInputStream fis=new FileInputStream("text.txt");
		    int a=Integer.parseInt(args[0]);
		    int b=Integer.parseInt(args[1]);// ArrayIndexOutOfBoundsException
		
		
		   double c=a/b; // creates an object of that exception type and will throw -> ArithmeticException
		
		   System.out.println(c);
		}
		catch(ArithmeticException e)
		{
	    	System.out.println("You can not divide by zero. Please check inputs");
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please provide both inputs");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please provide right inputs: intgers");	
		} 
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Inside finally");
		}	
		
		System.out.println("Bye");
	}

}
