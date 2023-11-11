package com.learning.string;

public class PyramidPattern {

	public static void main(String[] args) {
		int i=5;
		for(i=1;i<=5;i++) {
			System.out.println("*");
			for(int j=i;j<=i;j++) {
				System.out.print(" ");
			}
		}
	}
}
