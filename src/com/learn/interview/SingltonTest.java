package com.learn.interview;

public class SingltonTest {

	public static void main(String[] args) {

		Account instance1 = Account.getInstance();
		Account instance2 = Account.getInstance();
		
		String str1 = instance1.str;
		
		String str2 = instance2.str;
		System.out.println(str1);
		System.out.println(str2);
		
		if(instance1.hashCode()==instance2.hashCode()) {
			System.out.println("Both Object are same");
		}
	}
}
