package com.learning.threading.pcp;

public class Producer extends Thread{

	Company company;
	
	public Producer(Company company) {
		this.company=company;
	}
	
	@Override
	public void run() {		
		while (true) {
			company.producerItem(1);					
		}		
	}
}
