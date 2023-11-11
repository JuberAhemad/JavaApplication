package com.programing.interview.questions;

import java.util.Scanner;

public class RemoveSpaceFromString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); System.out.println("Enter Any String");
		String str=sc.nextLine();

		String spaceRemove = spaceRemove(str);
		System.out.println(spaceRemove);

	}

	public static String spaceRemove(String str) {
		String string="";
		for(int i=0;str.length()>i;i++) {
			//char ch = str.charAt(i);
			if (str.charAt(i)!=' ') {
				string=string+str.charAt(i);
			}
		}
		return string;
	}

}
