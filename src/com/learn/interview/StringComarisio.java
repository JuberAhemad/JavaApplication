package com.learn.interview;

public class StringComarisio {

	public static void main(String[] args) {
		String s1=new String("cloudtech");
		String s2=new String("cloudtech");
		if (s1==s2) {
			System.out.println("both object are equal");
		} else {
            System.out.println("Both Object are not equal");
		}
		
		if (s1.equals(s2)) {
			System.out.println("Both Object are equal");
		} else {
            System.out.println("Both Object are not equal");
		}

	}

}
