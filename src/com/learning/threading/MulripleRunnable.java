package com.learning.threading;

public class MulripleRunnable implements Runnable{
	
	public static void main(String[] args) {
		MulripleRunnable mr=new MulripleRunnable();
		Thread t1=new Thread(mr);
		
		Thread t2=new Thread(mr);
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		for(int i=0;i<=4;i++) {
			System.out.println("Execting is : "+Thread.currentThread()+ "and i is : "+i);
			try {
				Thread.sleep(1*1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
