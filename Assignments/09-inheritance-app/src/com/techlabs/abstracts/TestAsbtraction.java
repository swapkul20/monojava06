package com.techlabs.abstracts;

public class TestAsbtraction {

	public static void main(String[] args) {
		
		Shape shape;
		
		Circle circle=new Circle(5);
		shape=circle;
		shape.area();
		
		Rectangle rectangle=new Rectangle(5,5);
		shape=rectangle;
		shape.area();
		
		

	}

}
