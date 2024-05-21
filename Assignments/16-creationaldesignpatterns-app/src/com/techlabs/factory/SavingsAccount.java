package com.techlabs.factory;

public class SavingsAccount extends Account {
	
	private String type;

	public SavingsAccount(int accountnumber,String type) {
		super(accountnumber);
		this.type = type;
	}

	@Override
	double getInterestRate() {
		// TODO Auto-generated method stub
		return 7.5;
	}

	@Override
	public String toString() {
		return "SavingsAccount [type=" + type + ", accountnumber=" + accountnumber + "]";
	}



}
