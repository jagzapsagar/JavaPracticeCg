package com.example.demo.mapE;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(2, "Sagar");
		map.put(3, "Ram");
		map.put(4, "Ritesh");
		map.put(5, "Karan");
		
		for(Map.Entry<Integer, String> m: map.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		System.out.println("--- For each");
		map.forEach((a,b) -> {
			System.out.println(a +" "+ b);
		});
		
	}

}
