package com.example.demo.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReversEachWrdString {
	public static void main(String[] args) {
		String str = "Welcome to Mumbai";
		
		String[] ar = str.split(" ");
		
		String string = Arrays.stream(ar).map(e -> new StringBuilder(e).reverse()).collect(
				Collectors.joining(" "));
		System.out.println(string);
		
		String reduce = Arrays.stream(ar).reduce(" ", (a,b) -> b+" "+a);
		System.out.println(reduce);
	}

}
