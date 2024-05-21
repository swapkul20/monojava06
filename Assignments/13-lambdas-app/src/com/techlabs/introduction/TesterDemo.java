package com.techlabs.introduction;

public class TesterDemo {

	public static void main(String[] args) {

           // ITester tester=() -> System.out.println("Testing lamdas");
            
            show(() -> System.out.println("Testing lamdas"));
		
	}
	
	private static void show(ITester tester)
	{
		
		tester.test();
	}

}
