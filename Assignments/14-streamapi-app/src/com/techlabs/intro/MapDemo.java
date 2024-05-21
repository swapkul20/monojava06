package com.techlabs.intro;

import java.util.Arrays;
import java.util.List;

public class MapDemo {

	public static void main(String[] args) {


		List<String> names=Arrays.asList("Swati","Saurabh","Sohan","Sai","Ramya");
		
		names.stream().map(name -> name.toUpperCase()).forEach(name->System.out.println(name));

	}

}
