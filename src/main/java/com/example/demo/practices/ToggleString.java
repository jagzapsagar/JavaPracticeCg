package com.example.demo.practices;

import java.util.stream.Collectors;

public class ToggleString {
	public static void main(String[] args) {
		String str = "aBcd";
		
		String collect = str.chars().mapToObj(e ->{
			char c = (char)e;
			return Character.isUpperCase(c) ? Character.toLowerCase(c):Character.toUpperCase(c);
		}).map(e -> String.valueOf(e)).collect(Collectors.joining());
		
		System.out.println(collect);
		
	}
	

}
