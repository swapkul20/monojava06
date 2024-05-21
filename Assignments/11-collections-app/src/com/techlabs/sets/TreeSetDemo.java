package com.techlabs.sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
public static void main(String[] args) {
		
		Set<String> set=new TreeSet<String>();
		
		set.add("X");
		set.add("Z");
		set.add("Y");
		set.add("A");
		set.add("X");
		
		System.out.println(set);
		
		

	}

}
