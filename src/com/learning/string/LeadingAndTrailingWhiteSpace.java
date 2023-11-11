package com.learning.string;

import java.util.Scanner;

public class LeadingAndTrailingWhiteSpace {

	public static void main(String[] args) {

      //Scanner sc = new Scanner(System.in);
      //String str = sc.nextLine();
      
      String string="  abc  def\t";
      
      String s=removeWhiteSpace(string);
      System.out.println(""+s);

	}
	
	public static String removeWhiteSpace(String str) {
	    String trim = str.trim();	
	    String strip = str.strip();
		return trim;
	}
}
