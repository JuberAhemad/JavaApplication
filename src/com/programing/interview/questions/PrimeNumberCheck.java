/**
 * 
 */
package com.programing.interview.questions;

import java.util.Scanner;

/**
 * You can write a program to divide the given number n, by a number from 2 
 * to n/2 and check the remainder. If the remainder is 0, then it’s not a prime
 *  number.The following example code shows one way to check if a given number 
 *  is a Prime number:
 */
public class PrimeNumberCheck {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number To check Entered Number is Prime Or Not");
		int value = sc.nextInt();
		if (value%2!=0) {
			System.out.println("Entered Number Is Prime "+value);
		}else {
			System.out.println("Entered Number Is Not Prime Number "+value);
		}
	}
}
