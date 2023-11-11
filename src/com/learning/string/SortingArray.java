package com.learning.string;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		
		int[] arr= {1,4,6,2,9,5,10,3};
		Arrays.sort(arr);
		
        for(int i=0;i<arr.length;i++) {
        	System.out.println(""+arr[i]);
        }  
        System.out.println(Arrays.toString(arr));       
	}
}
