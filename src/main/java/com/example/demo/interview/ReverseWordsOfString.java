package com.example.demo.interview;

import java.util.Arrays;
import java.util.Optional;

public class ReverseWordsOfString {
	public static void main(String[] args) {
		String str = "Welcome to Mumbai";
		
		Optional<String> reduce = Arrays.stream(str.split(" ")).reduce((a,b) -> b+" "+a.toString());
		System.out.println(reduce);
	}

}
