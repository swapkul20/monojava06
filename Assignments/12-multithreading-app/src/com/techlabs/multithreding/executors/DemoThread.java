package com.techlabs.multithreding.executors;

import java.util.concurrent.Callable;

public class DemoThread implements Callable<String> {

	@Override
	public String call() throws Exception {

           return "Callable Threads Returning"; 
	}

	

}
