package com.programing.interview.questions;

import java.util.Scanner;

public class PalindromeTest {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in); System.out.println("Enter String");
		String str = sc.next();

		String rev =revString(str);
		if(str.equals(rev)) {
			System.out.println("Both String are Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

	public static String revString(String str) {
		String rev ="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		return rev;
	}

}
