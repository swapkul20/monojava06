package com.tehlabs.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DepenedencyTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("autoconfig.xml");
		
	
		Computer computer=(Computer)context.getBean("computer","Computer.class");
		
		System.out.println(computer);


		

	}

}
