package com.learn.interview;

public class BankAccount {
	
	private static BankAccount account=null;
	
	String str="Creating Object by Default Cunstructor";
	private BankAccount() {
		System.out.println(str);
	}
	
	public static BankAccount getAccount() {	
		if(account==null) {
			account=new BankAccount();
			return account;
		}else {
			return account;
		}	
	}
}
