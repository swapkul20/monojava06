package com.techlabs.multithreding;

public class MyThreadTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println(Thread.currentThread());


		MyThread thread1=new MyThread("MyThread1");// new/born
		
		MyThread thread2=new MyThread("MyThread2");
		MyThread thread3=new MyThread("MyThread3");
		
		thread1.getT1().setPriority(1);
		thread2.getT1().setPriority(5);
		thread3.getT1().setPriority(10);
		
		
		
		thread1.getT1().join();
		thread2.getT1().join();
		thread3.getT1().join();
		
		   System.out.println("Bye");
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
			Thread.sleep(500);
		}
		
		
		
	

	}

}
