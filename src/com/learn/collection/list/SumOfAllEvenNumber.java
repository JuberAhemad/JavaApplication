package com.learn.collection.list;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOfAllEvenNumber {

	public static void main(String[] args) {
		int[] aa= {1,2,3,4,5,6,7,8,9,10};
		
	     IntStream stream = Arrays.stream(aa);
	     int sum = stream.filter(e->e%2==0).sum();
	     System.out.println("sum of all even number = "+sum);

	}

}
