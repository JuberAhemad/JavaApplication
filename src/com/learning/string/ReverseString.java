package com.learning.string;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "abc";
		String rev ="";
		
		System.out.println("Orginal String is : "+str);
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}		
		System.out.println("Reverse String is : "+rev);
		
	}
}
