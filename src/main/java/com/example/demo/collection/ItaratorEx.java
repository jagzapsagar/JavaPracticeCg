package com.example.demo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ItaratorEx {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(4);
		list.add(78);
		list.add(65);
		list.add(2);
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//Reverse travel using List iterator
		System.out.println("List Iterator with previous");
		ListIterator litr = list.listIterator(list.size());
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
	}

}
