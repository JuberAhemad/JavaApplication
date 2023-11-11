package com.learning.string;

public class StringBufferReverse {
	/**
	 * 
	 **/
	public static void main(String[] args) {
		String str="abc";
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println("reverse string is : "+sb);
	}

}
