package com.techlabs.arrays;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		int array[]=new int[5];
		
		int array2[]= {10,20,30};
		
		int []array3= {1,2,3};
		
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
			array[i]=scanner.nextInt();
		
		for(int i=0;i<5;i++)
			System.out.println(array[i]);
		

	}

}
