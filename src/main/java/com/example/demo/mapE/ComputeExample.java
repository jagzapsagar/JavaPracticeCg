package com.example.demo.mapE;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.interfaces.main;

public class ComputeExample {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);
		
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey()+"---"+m.getValue());
		}
		
		map.forEach((a,b) -> {
			System.out.println(a+b);
		});
		System.out.println("Compute");
		map.compute("B", (k,v) -> (v==null) ? 45 : 0);// B= 0
		map.compute("Z", (k,v) -> (v==null) ? 85 : 0);// Z=85
		System.out.println(map);
		
		System.out.println("GetorDefault");
		Integer orDefault = map.getOrDefault("G", 25)+5;
		Integer orDefault2 = map.getOrDefault("A", 11);
		System.out.println("G " + orDefault);
		System.out.println("A " + orDefault2);
		System.out.println(map);
	}

}
