package com.example.demo.stream;

import java.util.Map;
import java.util.stream.Collectors;

public class CharOccurenceInString {
	
	public static void main(String[] args) {
		
		String name = "hello";
		
		name.chars() // Stream of Unicode values for each character
        .forEach(System.out::println); // Print each Unicode value
		
		 name.chars() // Stream of int (e.g., [104, 101, 108, 108, 111])
         .mapToObj(c -> (char) c) // Convert each int to its char representation
         .forEach(System.out::println); // Print each char
		
		Map<Character,Long> collect = name.chars().mapToObj(e -> (char)e).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(collect);
		
		Map<Character,Long> collect2 = name.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		
	}

}
