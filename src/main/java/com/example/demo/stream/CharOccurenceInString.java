package com.example.demo.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharOccurenceInString {
	
	public static void main(String[] args) {
		
		String name = "hello";
		
		List<Character> collect3 = name.chars().mapToObj(e -> (char) e).distinct().collect(Collectors.toList());
		String collect4 = name.chars().mapToObj(e -> String.valueOf((char) e)).distinct().collect(Collectors.joining());


		System.out.println(collect3); // U can use Set as well for soring disnct value 
		System.out.println(collect4);
		name.chars() // Stream of Unicode values for each character
        .forEach(System.out::println); // Print each Unicode value
		
		 name.chars() // Stream of int (e.g., [104, 101, 108, 108, 111])
         .mapToObj(c -> (char) c) // Convert each int to its char representation
         .forEach(System.out::println); // Print each char
		
		Map<Character,Long> collect = name.chars().mapToObj(e -> (char)e).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(collect);
		
		String str = "ab@cd";
		
		String removed = str.chars().filter(e -> Character.isLetterOrDigit(e) || Character.isWhitespace(e))
		.mapToObj(e -> (char) e).map(e -> String.valueOf(e)).collect(Collectors.joining());
		System.out.println(str);
		System.out.println(removed);
		
	}

}
