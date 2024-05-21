package com.techlabs.state;

public class Received implements IPackageState {

	@Override
	public void next(Packet packet) {

		System.out.println("Packet is already in  Received state");
		
	}

	@Override
	public void previous(Packet packet) {

         packet.setPackageState(new Delivered());
         System.out.println("Packet moved to prevoius Delivered state");
		
	}

	@Override
	public void status() {

		System.out.println("Packet is in Received state");
		
	}

}
