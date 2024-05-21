package com.techlabs.springannot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Harddisk {
	
	@Value("5")
	private int capacity;
	
	public Harddisk()
	{
		System.out.println("Inside default harddisk");
	}
   

	public Harddisk(int capacity) {
		super();
		this.capacity = capacity;
		System.out.println("Inside parameterized Harddisk");
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
		System.out.println("Inside setter capacity Harddisk");
	}

	@Override
	public String toString() {
		return "Harddisk [capacity=" + capacity + "]";
	}
	
	

}
