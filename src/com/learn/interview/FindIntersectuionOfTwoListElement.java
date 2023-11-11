package com.learn.interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class FindIntersectuionOfTwoListElement {

	public static void main(String[] args) {
		List<Integer> num1=new ArrayList<Integer>();
		num1.add(1);
		num1.add(2);
		num1.add(2);
		num1.add(3);
		num1.add(4);
		List<Integer> num2=new ArrayList<Integer>();
		num2.add(2);
		num2.add(2);
		
		Iterator<Integer> iterator1 = num1.iterator();
		while(iterator1.hasNext()){
			Integer x = iterator1.next();
			
			Iterator<Integer> iterator2 = num2.iterator();
			while(iterator2.hasNext()) {
				Integer y = iterator2.next();
				
				if(x==y) {
					System.out.println("Common Element is : "+x);
				}
			}
		}
		
		System.out.println("------By USsing Stream api------------");		
	}

}
