package com.example.demo.collection;

import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		
		LinkedList alist = new LinkedList();
		alist.add(456);
		alist.add("Sagar");
		System.out.println(alist);
		
		LinkedList<String> list = new LinkedList<>();
		list.add("Sagar");
		list.add("Rakesh");
		list.add("Sunil");
		list.add("Akash");
		list.add("Jeevan");
		System.out.println(list);
		//below method points to 2nd positoion of index bcoz its starting from Zero
		list.remove(1);
		//if list have Integer value the use 
		//list.remove(Integer.valueOf(2));
		System.out.println(list);
		list.remove("Jeevan");
		System.out.println(list);
		
		
		list.addFirst("First added");
		list.removeLast();
		System.out.println(list);
		System.out.println(list.contains("Akash"));
		System.out.println("Size: "+list.size());
		System.out.println(list);
		System.out.println("Get 1: "+list.get(0));
		list.clear();
	}

}
