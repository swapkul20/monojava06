package com.techlabs.state;

public class Delivered implements IPackageState{

	@Override
	public void next(Packet packet) {
		packet.setPackageState(new Received());
		System.out.println("Packet moved to Recieved state");
		
	}

	@Override
	public void previous(Packet packet) {

      packet.setPackageState(new Ordered());
      System.out.println("Packet moved to previous oredered state");
		
	}

	@Override
	public void status() {

		System.out.println("Packet is in  Delivered state");
		
	}

}
