package com.example.demo.stream;

import java.util.stream.Collectors;

public class RemoveDubliccateCharFromString {
	public static void main(String[] args) {
		String str = "Story on java";
		
		//Remove Dublicate
		String collect = str.chars().distinct().mapToObj(e -> (char)e).map(e -> e.toString())
		.collect(Collectors.joining());
		System.out.println(collect);
	}

}
