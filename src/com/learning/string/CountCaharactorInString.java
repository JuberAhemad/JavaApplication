package com.learning.string;

public class CountCaharactorInString {

	/**
	 *
	 **/
	public static void main(String[] args) {
		String str = "I love my India";
		int count=0;
		for(int i=0;i<str.length();i++) {
			char charAt = str.charAt(i);
			if (charAt!=' ') {
				count++;
			}			
		}
		System.out.println("Count is : "+count);
	}
}
