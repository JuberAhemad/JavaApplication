package com.programing.interview.questions;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		String string="java";
		System.out.println("Orginal String is : "+string);
		String revString = revString(string);
		System.out.println("Reverse String is : "+revString);

	}
	
	public static String revString(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		return rev;
	}

}
