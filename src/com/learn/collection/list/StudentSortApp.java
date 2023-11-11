package com.learn.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSortApp {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		list.add(new Student("1", "juber", "juber@gmail", 35));
		list.add(new Student("2", "iqra", "iqra@gmail", 2));
		list.add(new Student("3", "ayeza", "ayeza@gmail", 4));
		list.add(new Student("4", "khushbu", "khushbu@gmail", 28));

		System.out.println("Sorting By Name Ascending...");
		Student.sortByName(list);
		list.forEach(e->System.out.println("Sorting By Name : "+e.getName()));
		
		System.out.println("Sorting By age Ascending...");
		
		Student.sortByAge(list);
		list.forEach(e->System.out.println(e.getAge()));
	}

}
