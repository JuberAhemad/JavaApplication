package com.learning.string;

import java.util.Scanner;

public class FindFactorialOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();	
		int factorial = factorial(number);
		System.out.println(factorial);
		
	}
	
	//Finding factorial by recursion
	public static int factorial(int number) {
		if (number==1) {
			return 1;
		}	
		return (number * factorial(number - 1));
	}
}
