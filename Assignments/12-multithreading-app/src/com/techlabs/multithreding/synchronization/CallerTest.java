package com.techlabs.multithreding.synchronization;

public class CallerTest {

	public static void main(String[] args) throws InterruptedException{
		
		CallMe target = new CallMe();
		Caller ob1 = new Caller(target, "Hello");
		Caller ob2 = new Caller(target, "Synchronized");
		Caller ob3 = new Caller(target, "World");
		
		
//		ob1.t.join();
//		ob2.t.join();
//		ob3.t.join();
//	
//		try {
//		
//		} catch(InterruptedException e) {
//		System.out.println("Interrupted");
//		}
//

	}

}
