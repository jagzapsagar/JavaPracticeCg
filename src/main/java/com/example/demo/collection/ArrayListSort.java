package com.example.demo.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(4);
		list.add(8);
		list.add(1);
		System.out.println("Get 1: "+list.get(1));
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println(list.size());
	
		
		list.add(1, 111);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		list.removeIf(e -> e%2!=0);
		System.out.println(list);
	}

}
