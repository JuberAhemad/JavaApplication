package com.programing.interview.questions;

public class OverRidingFunctionMain {

	public static void main(String[] args) {
		Child c= new Child();
		c.show();
		c.getValue(100666, 661000);

		//String str = null;
		//String str1="abc";

		//System.out.println(str1.equals("abc") | str.equals(null));

		String x = "abc";
		String y = "abc";

		x=x.concat(y);
		//x.concat(y);
		System.out.print(x);

		//int w = 10 * 10 - 10;

		//System.out.println(w);

	}
}

class Parent{
	public void show() {
		System.out.println("Inside Parent show Function");
	}

	public int getValue(int x,int y) {
		int sum = x+y;
		System.out.println("Inside Parent Class getValue function sum = "+sum);
		return sum;
	}
}

class Child extends Parent{

	public void show() {
		System.out.println("Inside Chaild show Function");
	}

	public short getValue(short x,short y) {
		short sum = (short) (x+y);
		System.out.println("Inside Child Class getValue function sum = "+sum);
		return sum;
	}
}