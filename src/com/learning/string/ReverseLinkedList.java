package com.learning.string;

import java.util.LinkedList;
import java.util.stream.Stream;

public class ReverseLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> list= new LinkedList<>();
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(4);
		list.add(2);

		Stream<Integer> stream = list.stream();
		Stream<Integer> sorted = stream.sorted();
		System.out.println();
		sorted.forEach(e->System.out.println(e));
		
		//Printing linked list in reverse order
		LinkedList<Integer> ll1 = new LinkedList<>();
		list.descendingIterator().forEachRemaining(ll1::add);
		System.out.println(ll1);
	}
}
