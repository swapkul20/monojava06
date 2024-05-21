package com.techlabs.springannot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Computer {
	

	private String name;
	
	
	
	private Harddisk harddsik;
	
	public Computer()
	{
		System.out.println("Inside default Computer");
	}
	
	@Autowired
	public Computer(@Value("Apple") String name, Harddisk harddsik) {
		super();
		this.name = name;
		this.harddsik = harddsik;
		System.out.println("Inside parameterized Computer");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Harddisk getHarddsik() {
		return harddsik;
	}

	public void setHarddsik(Harddisk harddsik) {
		this.harddsik = harddsik;
		System.out.println("Inside setter harddisk Computer");
	}
	
	@Override
	public String toString() {
		return "Computer [name=" + name + ", harddsik=" + harddsik + "TB]";
	}
	
	

}
