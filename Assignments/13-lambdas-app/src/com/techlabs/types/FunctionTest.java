package com.techlabs.types;

import java.util.function.BiFunction;

public class FunctionTest {

	public static void main(String[] args) {

//
//		Function<Integer,Integer> function= (x) -> x*x;
//		
//		System.out.println(function.apply(10));
		
		BiFunction<Integer,Integer,Integer> biFunction= (x,y) -> x+y;
		
		//System.out.println(biFunction.apply(2, 3));
		
		biFunction=biFunction.andThen((x)->x*x);
		
		System.out.println(biFunction.apply(2, 3));

	}

}
