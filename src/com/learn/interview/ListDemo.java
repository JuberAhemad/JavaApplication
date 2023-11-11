package com.learn.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("pear");
		list.add("oranges");
		list.add("grapes");
		Stream<String> stream = list.stream();
		Map<Integer, List<String>> collect = stream.collect(Collectors.groupingBy(String::length));
		System.out.println("Group String : "+collect);
	}

}
