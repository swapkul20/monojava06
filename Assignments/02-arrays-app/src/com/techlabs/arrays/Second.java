package com.techlabs.arrays;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int matrix[][]=new int[3][3];
		
		readMatrix(matrix,scanner);
		printMatrix(matrix);
		
	}
	
	static void readMatrix(int matrix[][], Scanner scanner)
	{
		System.out.println("Enter array elements");
		for(int i=0;i<3;i++)
		{
			readRow(i,matrix,scanner);
		
		}
		
	}
	
	private static void readRow(int i, int[][] matrix, Scanner scanner) {
		
		for(int j=0;j<3;j++)
			matrix[i][j]=scanner.nextInt();
		
	}

	static void printMatrix(int matrix[][])
	{
		System.out.println("Matrix is ------------------------>");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(matrix[i][j]+"\t");
			
			System.out.println("");
		}
		
	}

}
