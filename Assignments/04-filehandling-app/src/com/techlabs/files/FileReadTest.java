package com.techlabs.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReadTest {

	public static void main(String[] args) throws Exception {
		
		FileInputStream inputStream=new FileInputStream("D:\\My Batches\\Monocept July 2023\\data.txt");
		
		int ch;
		
		while((ch=inputStream.read())!=-1)
		{
			System.out.print((char)ch);
		}
		
		inputStream.close();

	}

}
