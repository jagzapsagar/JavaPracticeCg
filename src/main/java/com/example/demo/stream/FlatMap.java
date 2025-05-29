package com.example.demo.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// ->> Find the all elements from List of list of Strings
// ->>like we have list1 it contain list of strings now we 
//want to fine all string in lingle list
public class FlatMap {
	public static void main(String[] args) {
		
		ArrayList<List<String>> list1 = new ArrayList<>();
		List<String> list2 = List.of("ABC","XYZ","TYB");
		List<String> list3 = List.of("Sagar","Sanket","Rakesh");
		
		list1.add(list2);
		list1.add(list3);
		
		List<String> collect3 = list1.stream().flatMap(e -> e.stream()).collect(Collectors.toList());// Good 
		System.out.println(collect3);
		
		List<String> collect = list1.stream().flatMap(e -> e.stream()).collect(Collectors.toList());
		System.out.println(collect);
		
		List<String> collect2 = list1.stream().flatMap(e -> e.stream())
		.filter(e -> e.startsWith("S")).collect(Collectors.toList());
		System.out.println(collect2);
		
		List<String> slist = Arrays.asList("ABC","XYZ");
		List<List<String>> llist = Arrays.asList(Arrays.asList("ABC","XYZ"),Arrays.asList("BBB","NNN"));
		System.out.println(llist);
	}

}
