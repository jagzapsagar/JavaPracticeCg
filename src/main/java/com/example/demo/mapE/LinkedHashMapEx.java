package com.example.demo.mapE;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		map.put(2, "Sagar");
		map.put(3, "Ram");
		map.put(4, "Ritesh");
		map.put(5, "Karan");
		
		for(Map.Entry<Integer, String> m: map.entrySet()) {
			System.out.println(m.getKey() +" "+ m.getValue());
		}
		System.out.println("map.foreach lopp");
		map.forEach((a,b) -> {
			System.out.println(a +" "+b);
		});
	}
	
	
	

}
