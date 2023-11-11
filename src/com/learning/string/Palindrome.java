package com.learning.string;

public class Palindrome {

	public static void main(String[] args) {
		String org = "rotator";
		String rev="";
		
		for (int i =org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
		
		if(org.equals(rev)) {
			System.out.println("String is palindrome in nature");
		}else {
			System.out.println("String is not Palindrome");
		}
		
	}
}
