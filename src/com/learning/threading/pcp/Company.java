package com.learning.threading.pcp;

public class Company {

	private int x;

	public void producerItem(int x) {
       this.x=x;
	}

	public void consumerItem(int x) {
      this.x=x;
	}

}
