package com.techlabs.factory;

public class CurrentAccount extends Account {
	
	private String name;

	public CurrentAccount(int accountnumber,String name) {
		super(accountnumber);
		this.name = name;
	}

	@Override
	double getInterestRate() {
		// TODO Auto-generated method stub
		return 6.5;
	}

	@Override
	public String toString() {
		return "CurrentAccount [name=" + name + ", accountnumber=" + accountnumber + "]";
	}


	
	

}
