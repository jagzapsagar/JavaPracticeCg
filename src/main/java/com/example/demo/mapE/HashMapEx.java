package com.example.demo.mapE;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		map.put("Sagar", 1);
		map.put("Rahul", 2);
		map.put("Pranav", 3);
		map.put("Sunil", 4);
		
		for(Map.Entry<String, Integer> m: map.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		System.out.println("--------Foreach Lopp ");
		map.forEach((e,t) -> {
			System.out.println(e);
			System.out.println(t);
		});
		
		Integer a = map.get("rahul");
	}

}
