package com.example.demo.interview;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramsString {
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		if(arr1.length==arr2.length) {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			boolean equals = Arrays.equals(arr1, arr2);
			System.out.println("String is anagrams");
		}else {
			System.out.println("NOT ANAGRAMS!!!!!");
		}
		
		boolean result = str1.length() == str2.length() && 
				str1.chars().boxed().collect(Collectors
						.groupingBy(Function.identity(), Collectors.counting()))
				.equals(str2.chars().boxed().collect(Collectors
						.groupingBy(Function.identity(), Collectors.counting())));
		
		System.out.println(result);
		
	}

}
