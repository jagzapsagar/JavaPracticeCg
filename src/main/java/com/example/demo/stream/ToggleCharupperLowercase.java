package com.example.demo.stream;

import java.util.stream.Collectors;

public class ToggleCharupperLowercase {
	public static void main(String[] args) {
		String str = "abCD";
		
		String collect = str.chars().mapToObj(e -> {
			char ch = (char)e;
			return Character.isUpperCase(ch) ?  Character.toLowerCase(ch):Character.toUpperCase(ch);
		})
		.map(e -> String.valueOf(e)).collect(Collectors.joining());
		
		System.out.println(collect);
	}

}
