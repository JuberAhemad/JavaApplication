package com.learning.threading.pcp;

public class Consumer extends Thread {

	Company company;
	public Consumer(Company company) {
		this.company=company;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}

}
