package demo;

import java.util.ArrayList;

public class ExceptionHnadling {

	public static void main(String[] args) throws ArithmeticException {
		
	
		ArrayList list=new ArrayList();
		list.add("A");
		list.add(10);
		list.add(1, "B");
		list.set(1, "C");
		System.out.println(list);
		 

	}

}
