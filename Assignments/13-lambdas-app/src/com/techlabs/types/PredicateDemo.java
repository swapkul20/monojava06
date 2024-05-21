package com.techlabs.types;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {


		Predicate<Integer> predicate= (x) -> (x%2==0) ;
			
		
		
		System.out.println("3 is even:?"+predicate.test(3));

	}

}
