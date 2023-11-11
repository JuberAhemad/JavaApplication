package com.learning.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListApp {

	public static void main(String[] args) {
		List<String> user= new ArrayList<>();
		
		user.add("juber");
		user.add("jubeen");
		user.add("jubeda");
		user.add("juber");
		user.add("juber");
		user.add("john");
		user.add("jeetu");
		user.add("iqra");
		user.add("ayeza");
		user.add("khushbu");
		user.add("atif");
		user.add("enaya");
		user.add("prince");
		user.add("taiba");
		user.add("gudiya");
		user.add("john");
		user.add("adam");
		user.add("mike");
		user.add("gudiya");
		
		user.forEach(e->{	
			if(e=="juber") {
				System.out.println(e);
			}
		 });
		
		/*
		 * Stream<String> stream = user.stream(); List<String>
		 * n=stream.filter(name->name.startsWith("g")).collect(Collectors.toList());
		 * System.out.println(n);
		 */
		
		/*
		 * System.out.println("-----------------------------------------");
		 * Stream<String> stream1 = user.stream(); List<String> collect =
		 * stream1.filter(e->e.contains("g")).collect(Collectors.toList());
		 * System.out.println(collect);
		 * System.out.println("-----------------------------------------");
		 */
		
		/*
		 * List<String> names = Arrays.asList("John", "Jane", "Adam", "Eve", "Mike");
		 * List<String> filteredNames = names.stream() .filter(name ->
		 * name.startsWith("J")) .map(String::toUpperCase)
		 * .collect(Collectors.toList()); System.out.println(filteredNames); // Output:
		 * [JOHN, JANE]
		 */	
		
		Stream<String> stream = user.stream();
		List<String> list = stream.filter(name->name.contains("jub"))
				.collect(Collectors.toList());
		System.out.println(list);
		
		/**
		 * Finding even number from list of integer
		 **/
		
		List<Integer> number = new ArrayList<>();
		number.add(1);number.add(2);number.add(8);number.add(9);number.add(10);number.add(11);
		number.add(3);number.add(4);number.add(5);number.add(6);number.add(7);
		
		
		Stream<Integer> stream2 = number.stream();		
		List<Integer> even = stream2.filter(num->num%2==0)
				.collect(Collectors.toList());
		System.out.println(even);
		
		
		Stream<Integer> stream3 = number.stream();
		List<Integer> ev = stream3.filter(n->n>5)
				.collect(Collectors.toList());
		System.out.println(ev);
		
		Stream<Integer> stream4 = number.stream();
		List<Integer> gsv = stream4.filter(n->n>5 && n<8 ).collect(Collectors.toList());
		System.out.println(gsv);
		
		Stream<Integer> stream44 = number.stream();
		List<Integer> asc = stream44.sorted().collect(Collectors.toList());
		System.out.println(asc);
		
		Stream<Integer> stream5 = number.stream();
		List<Integer> desc = stream5.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(desc);
		
	}
}
