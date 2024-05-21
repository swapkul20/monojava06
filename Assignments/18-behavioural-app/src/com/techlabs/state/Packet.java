package com.techlabs.state;

public class Packet {
	
	private IPackageState packageState;

	public Packet(IPackageState packageState) {
		super();
		this.packageState = packageState;
	}
	
	public IPackageState getPackageState() {
		return packageState;
	}

	public void setPackageState(IPackageState packageState) {
		this.packageState = packageState;
	}

	public void nextState()
	{
		packageState.next(this);
	}
	
	public void prevoiusState()
	{
		packageState.previous(this);
	}
	
	public void printStatus()
	{
		packageState.status();
	}
	

}
