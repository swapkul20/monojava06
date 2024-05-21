package com.techlabs.exceptions.model;

import com.techlabs.exceptions.MinimumBalanceException;

public class AccountTest {

	public static void main(String[] args) {

          Account account=new Account(101,"Swapnil",15000);
          
          System.out.println(account);
          
          account.deposit(1000);
          
          System.out.println(account);
          
          try
          {
        
          account.withdraw(15000);
          }
          catch(MinimumBalanceException e)
          {
        	  System.out.println(e.getMessage());
          }

          System.out.println(account);

	}

}
