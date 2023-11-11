package com.learning.threading;

public class MyThread extends Thread{

	public static void main(String[] args) {
		MyThread th = new MyThread();
		th.setName("One");
		th.start();	
	}
	
	public void run() {
		for(int i=0;i<=3;i++) {
			System.out.println("The running thread is : "+Thread.currentThread()+" value of i is :"+i);
			
		}
	}
}
