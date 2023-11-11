package com.learning.threading;

public class Wthdrawal implements Runnable {
    
	private Account account = new Account();
	
	public static void main(String[] args) {
		Wthdrawal w= new Wthdrawal();
		
		Thread t1= new Thread(w);
		t1.setName("Fred");
		t1.setPriority(9);
		
		Thread t2= new Thread(w);
		t2.setName("Lucy");
		t2.setPriority(8);
		
		t1.start();
		t2.start();
		
	}
		
	@Override
	public void run() {
		for(int i=0;i<5;i++) {	
			makeWithdrawal(10);
			if (account.getBalance()<0) {
				System.out.println("Account is OverDrawn");
			}
		}		
	}
	
	public synchronized void makeWithdrawal(int amount) {
		if (account.getBalance()>=amount) {
			System.out.println(""+Thread.currentThread().getName()+" is Going to withdrawal");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			 account.withdraw(amount);
			 System.out.println(""+Thread.currentThread().getName()+" is Completed the withdrawal");
		} else {
			System.out.println("Not enough in account for "+Thread.currentThread().getName()+" to withdrawal "+account.getBalance());
		}
	}

}
