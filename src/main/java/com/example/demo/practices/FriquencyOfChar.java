package com.example.demo.practices;

import java.util.HashMap;

public class FriquencyOfChar {
	public static void main(String[] args) {
		String str = "hello sagar";
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length()-1;i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		
		System.out.println(map);
	}

}
