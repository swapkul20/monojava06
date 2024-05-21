package com.techlabs.multithreding.test;

public class Tester {

	public static void main(String[] args) {


		ITester test1=() -> System.out.println("test");
			
	
       test1.test();	
	}

		
	}


