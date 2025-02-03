package com.example.demo.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(7);
		set.add(4);
		set.add(12);
		set.add(5);
		set.add(0);
		System.out.println("Set: "+set);
	}

}
