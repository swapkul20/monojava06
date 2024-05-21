package com.techlabs.singleton;

public class LoginTest {

	public static void main(String[] args) {

        Login login1=Login.getLogin();
        
        System.out.println(login1.hashCode());
        
      Login login2=Login.getLogin();
        
       System.out.println(login2.hashCode());
       
       Login login3=Login.getLogin();
       
       System.out.println(login3.hashCode());
		
	}

}
