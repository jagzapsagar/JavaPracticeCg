package com.example.demo.mapE;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("Sagar", 1);
		map.put("Rahul", 2);
		map.put("Pranav", 3);
		map.put("Sunil", 4);
		
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		System.out.println(map.containsKey("Sunil"));
		System.out.println(map.containsValue(2));
		
		System.out.println(map.get("Pranav"));
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println("removed: "+map.remove("Pranav"));
		map.clear(); // void return
	}

}
