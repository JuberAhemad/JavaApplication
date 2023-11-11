package com.learn.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableApp{

	public static void main(String[] args) {
		List<Employee> emplist=new ArrayList<>();
		emplist.add(new Employee("1", "juber", "juber@gmail.com", 35, "it"));
		emplist.add(new Employee("3", "iqra", "iqra@gmail.com", 2, "it"));
		emplist.add(new Employee("5", "ayeza", "ayeza@gmail.com", 4, "it"));		
		emplist.add(new Employee("2", "khushbu", "khushbu@gmail.com", 30, "it"));
		
		Collections.sort(emplist);
		
		//for printing sorted list 
		emplist.forEach(e->System.out.println(e.getId()));
	}


}
