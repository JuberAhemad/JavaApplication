package com.learn.interview;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcateListElement {

	public static void main(String[] args) {
		List<String> list = List.of("Hello"," ","Word","!");
		Iterator<String> iterator = list.iterator();
		String complete="";
        while(iterator.hasNext()) {
        	String str = iterator.next();
        	complete=complete.concat(str);
        }
        System.out.println(complete);
        
        System.out.println("----By Using Stream Api-----");
        
        Stream<String> stream = list.stream();
        String str1=stream.collect(Collectors.joining());
        System.out.println(str1);
	}

}
