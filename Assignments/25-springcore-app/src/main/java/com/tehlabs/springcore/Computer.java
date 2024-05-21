package com.tehlabs.springcore;

public class Computer {
	
	private String name;
	private Harddisk harddisk;
	
	
	public Computer()
	{
		System.out.println("Inside Default Computer");
		
	}
	public Computer(String name, Harddisk harddisk) {
		super();
		this.name = name;
		this.harddisk = harddisk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
		System.out.println("Inside setter Computer name");
	}
	public Harddisk getHarddisk() {
		return harddisk;
	}
	public void setHarddisk(Harddisk harddisk) {
		this.harddisk = harddisk;
		System.out.println("Inside setter Computer harddisk");
	}
	@Override
	public String toString() {
		return "Computer [name=" + name + ", harddisk=" + harddisk + "TB]";
	}
	
	

}
