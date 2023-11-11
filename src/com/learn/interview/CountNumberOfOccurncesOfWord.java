package com.learn.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CountNumberOfOccurncesOfWord {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("apple");
		list.add("oranges");
		list.add("apple");
		list.add("oranges");
		
		Stream<String> stream=list.stream();
		long count = stream.filter(e->e.equals("oranges")).count();
		System.out.println(count);

	}

}
