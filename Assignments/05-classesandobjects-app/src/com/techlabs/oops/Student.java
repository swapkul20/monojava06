package com.techlabs.oops;

public class Student {

	  private int rollnumber;
	    private String name;
	   private double percentage;
	
	   public int getRollnumber() {
		return rollnumber;
	}

	   public Student()
	   {
		   this(0,null,0.0); // constructor chaining
	   }
	   
	   public Student(int rollnumber, String name, double percentage)
	   {
		   this.rollnumber=rollnumber;
		   this.name=name;
		   this.percentage=percentage;
	   }
	   
	   public Student(int rollnumber,String name)
	   {
		  this(rollnumber,name,50);
	   }
	   
	private void display()
	{
		System.out.println("Roll Number:"+rollnumber);
		System.out.println("Name:"+name);
		System.out.println("Percentage:"+percentage);
		
	
	}
	
	public void print()
	{
		display();
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
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	   
	  
}
