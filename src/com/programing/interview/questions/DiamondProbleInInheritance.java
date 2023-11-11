package com.programing.interview.questions;

public class DiamondProbleInInheritance {

	public static void main(String[] args) {
		MyInterface m= new C();
		m.show();

	}
}

interface MyInterface{
	public void show();
}

class A implements MyInterface{

	@Override
	public void show() {
		System.out.println("Inside A class");		
	}	
}

class B implements MyInterface{

	@Override
	public void show() {
		System.out.println("Inside B class");		
	}	
}

class C extends A{
    //If we Trying to extends class B also then it will through compile time error 
	public void show() {
		System.out.println("Inside C class");	
	}
}
