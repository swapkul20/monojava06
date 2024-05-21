package com.tehlabs.springcore;

public class Harddisk {
	
	private int capacity;
	
	public Harddisk()
	{
		System.out.println("Inside Default Harddsik");
	}

	public Harddisk(int capacity) {
		super();
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
		System.out.println("setter of Harddisk");
	}

	@Override
	public String toString() {
		return "Harddsik [capacity=" + capacity + "]";
	}
	
	

}
