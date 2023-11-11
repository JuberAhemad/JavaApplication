package com.learn.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindByNameFromList {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("juber");
		list.add("anurag");
		list.add("aman");
		list.add("iqra");
		list.add("atif");
		
		List<String> collect = list.stream().filter(e->e.startsWith("a")).collect(Collectors.toList());
         System.out.println("The names start with 'a' is : "+collect);
	}

}
