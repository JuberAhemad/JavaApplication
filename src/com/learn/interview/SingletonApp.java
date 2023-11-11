package com.learn.interview;

public class SingletonApp {

	public static void main(String[] args) {
		
		BankAccount account1 = BankAccount.getAccount();
		BankAccount account2 = BankAccount.getAccount();
		
		if(account1.equals(account2)) {
			System.out.println("Both Object Are "+account1.hashCode() + " AND "+account2.hashCode());
		}else {
			System.out.println("They Are Not Same");
		}
		String str = account1.str;
		System.out.println("Creating Object One "+str);
		
		String str1 = account2.str;
		System.out.println("Creating Object Two " +str1);
	}
}
