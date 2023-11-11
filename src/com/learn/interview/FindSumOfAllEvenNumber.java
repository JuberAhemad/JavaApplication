package com.learn.interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindSumOfAllEvenNumber {

	public static void main(String[] args) {
		
        List<Integer> num=new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(8);
        num.add(9);
        
        System.out.println("----By Using Iterator Interface----");
        
        Iterator<Integer> itr=num.iterator();
        int sum=0;
        while(itr.hasNext()) {
        	int x=itr.next();
        	if(x%2!=0) {
        		sum=sum+x;
        	}
        }
        
        System.out.println("Sum Of all even number is : "+sum);
        
        System.out.println("--------------By Using Java 8 Feature--------------");
        Stream<Integer> stream = num.stream();
        int agg;
        List<Integer> list = stream.filter(e->(e%2==0)).collect(Collectors.toList());
        
	}

}
