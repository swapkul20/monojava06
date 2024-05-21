package com.techlabs.introduction.commandlines;

public class DebugTest {

	public static void main(String[] args) {
		int a=5;
		int b=7;
		
		int d=substraction(a,b);
		System.out.println(d);
		
		int c=addition(a,b);
		
		System.out.println("Addition:"+c);
		
	}

	private static int substraction(int a, int b) {
		
		System.out.println("hi");
		return a-b;
	}

	private static int addition(int a, int b) {
		
		return a+b;
	}

}
