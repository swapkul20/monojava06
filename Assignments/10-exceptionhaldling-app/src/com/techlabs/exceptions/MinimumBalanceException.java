package com.techlabs.exceptions;

public class MinimumBalanceException extends RuntimeException{

	private double balance;

	public MinimumBalanceException(double balance) {
		super();
		this.balance = balance;
	}
	
	public String getMessage()
	{
		return "Insufficient Fund:"+balance+"----------> Minimum balance shoud be 5000";
	}
}
