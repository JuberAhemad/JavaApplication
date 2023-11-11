package com.learning.threading;

public class Account {
	private int balance=50;

	public int getBalance() {
		return balance;
	}

	public int withdraw(int amount) {
		balance=balance-amount;
		return balance;
	}
}
