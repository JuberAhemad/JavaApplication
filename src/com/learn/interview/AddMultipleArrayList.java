package com.learn.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddMultipleArrayList {


	public static void main(String[] args) {
		List<String> list1=List.of("Juber","Khushbu","Iqra","Ayeza","Anna","Prince");
		List<String> list2=List.of("Asad","Juhi","Afsheen","Anam","Ayeza","Taiba");
		List<String> list3=List.of("Abee","Mahida","Anna","Alisha","Iqra","Gudiya");
		List<String> combine=new ArrayList<String>();
		combine.addAll(list1);
		combine.addAll(list2);
		combine.addAll(list3);

		System.out.println(combine);

		combine.forEach(e->System.out.println(e));

		Stream<String> stream = combine.stream();
		Stream<String> filter = stream.filter(e->e.contentEquals("Juber"));
		System.out.println(filter.collect(Collectors.toList()));

		Stream<String> stream1 = combine.stream();
		List<String> names=stream1.filter(x->x.contains("A")).collect(Collectors.toList());
		System.out.println(names);

		List<String> match = combine.stream().filter(e->e.matches("r")).collect(Collectors.toList());
		System.out.println(match);

		List<String> name1 = combine.stream().filter(e->e.endsWith("a")).collect(Collectors.toList());
		System.out.println(name1);
		
		List<String> ucase = combine.stream().filter(e->e.endsWith("a")).collect(Collectors.toList());
	    System.out.println(ucase.toString().toUpperCase());
	    
	    Stream<String> distinct = combine.stream().distinct();
	    long count = distinct.count();
	    System.out.println(count);
	}

}

