package com.learning.threading;

public class MyRunnable  implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=4;i++) {
			System.out.println("The running thread is : "+Thread.currentThread()+" value of i is :"+i);	
		}		
	}
	
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t1= new Thread(mr);		
		t1.start();
	}

}
