package com.techlabs.finals;

public class TestA {

	public static void main(String[] args) throws CloneNotSupportedException {


		A obj=new A();
		
		A cloneobj=(A)obj.clone();
		
		System.out.println(obj.hashCode());
		System.out.println(cloneobj.hashCode());
		
		System.out.println(obj.equals(cloneobj));

	}

}
