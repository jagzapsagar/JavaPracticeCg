package com.example.demo.stream;

public class StringContainsDigits {
	public static void main(String[] args) {
		String str = "653298";
		
		boolean allMatch = str.chars().allMatch(e -> Character.isDigit(e));
		System.out.println(allMatch);
	}

}
