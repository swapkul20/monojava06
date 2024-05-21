package com.techlabs.state;

public interface IPackageState {
	
	void next(Packet packet);
	void previous(Packet packet);
	void status();

}
