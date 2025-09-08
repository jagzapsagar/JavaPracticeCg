package com.example.demo.stream;

import java.util.List;
import java.util.stream.Collectors;

public class DigitAlphaSeperate {
	public static void main(String[] args) {
		String str = "ab1@2j*g78";
		
		List<String> collect = str.chars()
		.filter(Character::isDigit)
		 .mapToObj(e -> String.valueOf((char)e))
		 .collect(Collectors.toList());
		System.out.println(collect);
		
		List<String> collect2 = str.chars().filter(Character::isLetter)
		.mapToObj(r -> String.valueOf((char)r))
		.collect(Collectors.toList());
		System.out.println(collect2);
		
		List<String> collect3 = str.chars().filter(d -> !Character.isLetterOrDigit(d))
				.mapToObj(r -> String.valueOf((char)r))
				.collect(Collectors.toList());
				System.out.println(collect3);
	}

}
