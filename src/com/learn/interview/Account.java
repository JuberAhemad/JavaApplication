package com.learn.interview;

public class Account {

	private static Account account=null;

	public String str;   

	private Account() {
		str = "it is an example of singleton class.";   
	}

	public static Account getInstance() {

		if(account==null) {
			account= new Account();
			return account;
		}else {
			return account;
		}
					
	}	
}
