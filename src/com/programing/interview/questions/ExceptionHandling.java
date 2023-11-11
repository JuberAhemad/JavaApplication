package com.programing.interview.questions;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Enter First Digit");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Enter Second Digit");
		Scanner s = new Scanner(System.in);
		int y = s.nextInt();
		
		getValue(x,y);
			
		sc.close();
		s.close();
	}
	
	public static void getValue(int x,int y) {
		
		try {
			int z=x/y;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}	
	}
}
