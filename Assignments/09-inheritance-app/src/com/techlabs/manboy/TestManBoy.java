package com.techlabs.manboy;

public class TestManBoy {

	public static void main(String[] args) {
	
		
		Man man;
		
		man=new Boy();  // a superclass reference can refer to subclass object
		
		man.eat();
		man.walk();
		
		man.sleep();
		
		// man.play();   // superclass reference can access only those elements which are inherited

		man=new Child();
		
		man.eat();man.sleep();man.walk();
		
		man=new Infant();
		man.eat();man.sleep();man.walk();
	}

}
