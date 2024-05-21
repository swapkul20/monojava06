package com.techlabs.singleton;

public class Login {
	
	private static Login login;
    private Login()
    {
    }
     
    public static Login getLogin()
    {
        if(login==null)  // LAzy instantiation
    	    login= new Login();
        
        return login;
    }

}
