package com.techlabs.lists;

import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> names=new LinkedList<String>();
		
		System.out.println(names);
		
		names.add("Ayushi");
		names.add("Sohan");
		names.add("Neha");
		names.add("Dharam");
		
		names.addFirst("Sanjay");
		names.addLast("Swati");
//		
//		names.add(10);
//		
//		names.add(100.55);
//		
//		names.add(true);
		
		System.out.println(names);
		
		names.remove("Sohan");
		
		names.remove(0);
		
		names.set(1, "Sagar");
		
		names.add(1, "Sai");
		
		System.out.println(names);
		
		System.out.println(names.get(1));

	}

}
