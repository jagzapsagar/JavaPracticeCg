package com.example.demo.stream;

import java.util.Map;
import java.util.stream.Collectors;

public class CharOccurenceInString {
	
	public static void main(String[] args) {
		
		String name = "hello";
		
		Map<Character,Long> collect = name.chars().mapToObj(e -> (char)e).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(collect);
		
		Map<Character,Long> collect2 = name.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		
	}

}
