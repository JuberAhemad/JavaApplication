package com.learn.collection.list;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListApp {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		list.add("juber");
		list.add("iqra");
		list.add("ayeza");
		list.add("khushbu");
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
			if(name.equals("juber")) {
				list.remove(0);
			}					
		}
		
		System.out.println(list.size());	
		list.forEach(e->System.out.println(e));
		
	}
}
