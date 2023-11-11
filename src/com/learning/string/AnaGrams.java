package com.learning.string;

import java.util.Arrays;

public class AnaGrams {
	
	/**
	 * 
	 **/

	public static void main(String[] args) {
		String str1 = "boog";
		String str2 ="glob";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if (str1.length()==str2.length()) {
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean result = Arrays.equals(ch1, ch2);
			if (result) {
				System.out.println("Both String is Anagrams");
			}else {
				System.out.println("Both String is not Anagrams");
			}
		} else {
           System.out.println("Both String length is different");
		}
	}
}
