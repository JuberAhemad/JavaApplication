package com.programing.interview.questions;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		//Swaping logic goes here		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("value of y : "+y);
		System.out.println("value of x : "+x);

	}

}
