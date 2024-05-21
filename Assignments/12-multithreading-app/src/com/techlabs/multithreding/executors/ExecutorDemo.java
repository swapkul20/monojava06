package com.techlabs.multithreding.executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {


		
		ExecutorService service=Executors.newFixedThreadPool(5);
		

        List<DemoThread> threads=new ArrayList<DemoThread>();
        
        threads.add(new DemoThread());
        threads.add(new DemoThread());
        threads.add(new DemoThread());
        threads.add(new DemoThread());
        threads.add(new DemoThread());
        threads.add(new DemoThread());
        threads.add(new DemoThread());
        threads.add(new DemoThread());
        threads.add(new DemoThread());
        
        List<Future<String>> futures=service.invokeAll(threads);
        
        for(Future<String> future:futures)
        	System.out.println(future.get());
        
        System.out.println(service.invokeAny(threads));
        
        service.shutdown();
        
        
        
		
//		ExecutorService service2=Executors.newSingleThreadExecutor();
//		
//		Future future= service2.submit(new DemoThread());
//		
//		if(future.isDone())			
//		          System.out.println(future.get());
//		
//		System.out.println(future.isDone());
//		
//		
//		service2.shutdown();
//	

	}

}
