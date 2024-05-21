package com.techlabs.abstracts;

public class Rectangle extends Shape {
	
	private double length;
	private double breadth;
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public void area() {
		
		System.out.println("Area of Rectangle:"+length*breadth);
		
	};
	

}
