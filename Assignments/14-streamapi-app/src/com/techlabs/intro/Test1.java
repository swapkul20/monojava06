package com.techlabs.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {


		List<Integer> list=Arrays.asList(100,25,300,45,50);
		
		list.stream().forEach(x-> System.out.println(x+5));
		
		
		list.stream().filter(x -> x%2==0).forEach(x-> System.out.println(x));
		
		
		List<Integer> collect=list.stream().filter(x -> x%2==0).collect(Collectors.toList());
		
		System.out.println(collect);
		
		
		int sum=list.stream().reduce(0, (x,y)->x+y);
		
		System.out.println(sum);
		
		List<Integer> firstList=Arrays.asList(10,20,30);
		List<Integer> secondList=Arrays.asList(50,60,70,40);
		List<List<Integer>> combinedList=Arrays.asList(firstList,secondList);
		
		int sum2=combinedList.stream().flatMap(l->l.stream()).reduce(0,(x,y)->x+y);
		System.out.println(sum2);
		
		list.stream().sorted().forEach(x->System.out.println(x));
		
		System.out.println(list.stream().count());
		
		System.out.println(list.stream().allMatch(x->x==300));
		
		System.out.println(list.stream().anyMatch(x->x==300));
		
		System.out.println("---------------------------------->");
	
	  list.stream().limit(3).forEach(x->System.out.println(x));

	}

}
