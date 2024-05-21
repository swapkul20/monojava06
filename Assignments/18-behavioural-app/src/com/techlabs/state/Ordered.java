package com.techlabs.state;

public class Ordered implements IPackageState{

	@Override
	public void next(Packet packet) {
		
		packet.setPackageState(new Delivered());
		System.out.println("Packet moved to Delivered state");
	}

	@Override
	public void previous(Packet packet) {
		
		System.out.println("Packet is already oredred");
	}

	@Override
	public void status() {
		System.out.println("Packet is in ordered state");
		
	}

}
