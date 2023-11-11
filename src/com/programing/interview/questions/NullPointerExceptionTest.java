package com.programing.interview.questions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NullPointerExceptionTest {

	public static void main(String[] args) {
		
		printString(null, 3);
			
		List<Employee> list = getList();
		System.out.println("List is : "+list);
		Iterator<Employee> iterator = list.iterator();
		while(iterator.hasNext()) {
			Employee emp = iterator.next();
			System.out.println(emp.getName());
		}	
	}

	public static List<Employee> getList(){
		List<Employee> list =null;
		// list = new ArrayList<>();
		//list.add(new Employee(1,"Juber", "juber@gmail.com"));
		//list.add(new Employee(2,"iqra", "iqra@gmail.com"));
		//list.add(new Employee(3,"ayeza", "ayeza@gmail.com"));
		return list;
	}
	
	public static void printString(String str,int count) {
		for(int i=0;i<count;i++) {
			System.out.println(str.toUpperCase());
		}
	}

}
