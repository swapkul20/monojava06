package com.techlabs.sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LnikedHashSetDemo {
	
public static void main(String[] args) {
		
		Set<String> set=new LinkedHashSet<String>();
		
		set.add("X");
		set.add("Z");
		set.add("Y");
		set.add("A");
		set.add("X");
		
		System.out.println(set);

	}

}
