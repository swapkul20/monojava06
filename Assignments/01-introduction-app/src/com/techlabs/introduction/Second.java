package com.techlabs.introduction;

public class Second {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Before swapping");
		System.out.println("a="+a+"\t b="+b);
	
		int c=a;
		a=b;
		b=c;
		
		System.out.println("After swapping");
		System.out.println("a="+a+"\t b="+b);
	
	}

}
