package com.techlabs.state;

public class StateTest {

	public static void main(String[] args) {
		
		Packet packet=new Packet(new Ordered());
		
		packet.printStatus();
		
		packet.nextState();
		packet.printStatus();
		
		packet.nextState();
		packet.printStatus();
		
		packet.prevoiusState();
		packet.printStatus();

          

	}

}
