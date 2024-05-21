package com.techlabs.factory;

public class AccountFactoryTest {

	public static void main(String[] args) {
	
	
	
		Account account=AccountFactory.getAccount("Current");
		
		System.out.println(account);
		
		account=AccountFactory.getAccount("Savings");
		
		System.out.println(account);

	}

}
