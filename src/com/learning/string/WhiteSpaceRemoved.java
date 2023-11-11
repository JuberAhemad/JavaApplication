package com.learning.string;

public class WhiteSpaceRemoved {

	public static void main(String[] args) {
		String str = "   India is a great country   ";
		String str2="";
		System.out.println("Count total no. of character in string is : "+str.length());
		System.out.println("Removing space from string by trim method of String class : "+str.trim());
	
		//Removing space from word
		System.out.println(str.replaceAll(" ", " "));
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if (ch!=' ') {
				str2=str2+ch;
			}
		}
		
		System.out.println("String is : "+str2);
	    
	}
}
