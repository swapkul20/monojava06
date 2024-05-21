package com.techlabs.introduction;

public class AdditionTest {

	public static void main(String[] args) {

        IAddition adder=(a,b) -> a+b;
        
        
        System.out.println(adder.addition(10, 20));
	}

}
