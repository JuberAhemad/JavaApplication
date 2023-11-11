package com.programing.interview.questions;

public class Java8InterfaceTestClass implements Java8Interface{

	public static void main(String[] args) {
		//Java8Interface ji =()-> System.out.println("Calling show Function By Lambda function");
		Java8Interface ji =()->{
			System.out.println("Calling show Function By Lambda function");
		};
		
		System.out.println(ji);
		
		//Calling Interface Default Function and static Function
		
		Java8Interface test= new Java8InterfaceTestClass();
		test.demo();
		//test.staticTest();
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
}
