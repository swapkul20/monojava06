package com.techlabs.factory;

public class AccountFactory {
	
	public static Account getAccount(String type)
	{
		if(type.equals("Savings"))
			return new SavingsAccount(101,"Savings");
		if(type.equals("Current"))
			return new CurrentAccount(201,"Dharam");
		
		return null;
		    
	}

}
