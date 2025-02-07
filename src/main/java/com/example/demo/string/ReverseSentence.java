package com.example.demo.string;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseSentence {
	public static void main(String[] args) {
		String str = "Welcome to Pune";
		
		String revs = Arrays.stream(str.split("\\s")).reduce((a,b) -> b+" "+ a).orElse("");
		System.out.println(revs);
		
		String string = Arrays.stream(str.split("\\s"))
		.map(w -> new StringBuilder(w).reverse().toString())
		.collect(Collectors.joining(" "));
		
		
		System.out.println("Revese Word "+ string);
	}

}
