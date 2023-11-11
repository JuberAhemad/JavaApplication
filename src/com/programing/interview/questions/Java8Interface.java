package com.programing.interview.questions;

@FunctionalInterface
public interface Java8Interface {

	public void show();
	//public void get();
	
	default void demo() {
		System.out.println("Inside Interface calling default method");
	}
	
	static void staticTest() {
		System.out.println("Inside Interface calling default method");
	}
}
