package com.techlabs.types;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

       Consumer<Integer> consumer= (x) ->{ 
    	    
    	   int fact=1;
    	   for(int i=1;i<=x;i++)
    		   fact=fact*i;
    	   System.out.println(fact);
       };
       
       consumer.accept(10);

	}

}
