package com.learn.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Optional;

public class LinkedListApp {
	
	public static void main(String[] args) {
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("juber");
		linkedList.add("iqra");
		linkedList.add("ayeza");
		linkedList.add("khushbu");
		linkedList.add(1, "Khushbu");
		
		linkedList.add(3, "atif");
		
		linkedList.forEach(e->System.out.println(e));
		
		Optional<String> findAny = linkedList.stream().findAny();
		if (findAny.isPresent()) {
			Optional<String> filter = findAny.filter(e->e.contains("juber"));
			System.out.println(filter);
			String string = findAny.get();
			System.out.println(string);
		}
		
		System.out.println("---------By Iterating and adding ------------------");
		
		Iterator<String> itr=linkedList.iterator();
		while (itr.hasNext()) {
			String next = itr.next();
			System.out.println(next);
			
		}
		
		System.out.println("---------By Using ListIterator and adding ------------------");
		
		ListIterator<String> listIterator = linkedList.listIterator();
		while (listIterator.hasNext()) {
			linkedList.remove(3);
			String next = listIterator.next();
			System.out.println(next);
			
		}
	}
}
