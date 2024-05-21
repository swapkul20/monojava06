package com.techlabs.multithreding;

public class MyThread implements Runnable {	
	
	private String name;
	private Thread t1;
	
	public Thread getT1() {
		return t1;
	}

	public void setT1(Thread t1) {
		this.t1 = t1;
	}

	public MyThread(String name) {
		t1=new Thread(this);
		t1.start();
		this.name=name;
		
	}

	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(name+" : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
