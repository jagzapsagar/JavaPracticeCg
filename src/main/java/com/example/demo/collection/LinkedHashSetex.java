package com.example.demo.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetex {
	
	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		set.add(7);
		set.add(4);
		set.add(12);
		set.add(5);
		System.out.println("Set: "+set);
		ArrayList<Integer> list = new ArrayList<>();
		list.add(78);
		list.add(89);
		list.add(45);
		System.out.println("List: "+list);
		set.addAll(list);
		System.out.println(set);
		
		//return true if all elemnt contain in set
		System.out.println("ContainAll methid: "+set.containsAll(list));
		System.out.println("Contain method: "+set.contains(122));
		
		System.out.println("Size of set: "+set.size());// Size
		System.out.println("Hashcode "+set.hashCode());
		System.out.println(set.isEmpty());
		System.out.println(set.remove(45));
		
		set.forEach(e -> System.out.println(e));
		
		for(Integer i : set) {
			System.out.println(i);
		}
	}

}
