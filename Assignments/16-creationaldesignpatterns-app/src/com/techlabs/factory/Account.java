package com.techlabs.factory;

public abstract class Account {
	protected int accountnumber;
	
	public Account(int accountnumber) {
		super();
		this.accountnumber = accountnumber;
	}

	abstract double getInterestRate();

}
