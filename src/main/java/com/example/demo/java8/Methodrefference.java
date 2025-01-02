package com.example.demo.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Methodrefference {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Sagar");
		list.add("Anil");
		list.add("Pranav");
		list.add("ram");
		list.add("Ritesh");
		
		List<String> collect = list.stream().filter(StringEx::TestString).collect(Collectors.toList());
		System.out.println(collect);
		
		//Another Method Reffrence
		collect.forEach(System.out::println);
	}

}

class StringEx{
	public static boolean TestString(String str) {
		return(str.length()%2==0 ? true:false);
	}
}
