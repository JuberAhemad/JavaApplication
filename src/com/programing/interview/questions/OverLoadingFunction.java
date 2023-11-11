package com.programing.interview.questions;

public class OverLoadingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calling OverLoaded function 
		
		OverLoadingFunction of=new OverLoadingFunction();
		of.show();
		of.show(5);
		of.show(5,10);
		of.show('C');
	}
	
	public  void show() {
		System.out.println("Inside show function");
	}
	
	//static method can not be overload
	/*
	 * public static void show() { System.out.println("Inside show function"); }
	 */
	
	/*
	 * public int show() { System.out.println("Inside show function"); return 0; }
	 */
	
	public void show(int x) {
		System.out.println("Inside show function which taking single int type argument = " +x);
	}
	
	public int show(int x,int y) {
		System.out.println("Inside show function which taking integer type argument= " +x +"And"+ +y);
		return x+y;
	}
	public void show(char c) {
		System.out.println("Inside show  function which taking char type argument = " +c);
	}

}
