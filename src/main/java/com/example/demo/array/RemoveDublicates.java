package com.example.demo.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDublicates {
	public static void main(String[] args) {
		
		List<Integer> intList = List.of(2,7,6,7);
		
		List<String> StringList = List.of("Sagar", "Pranav","Rakesh","Pranav");
		//We can use Distinnct for removeing Dublicate
		List<Integer> sortL= intList.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(sortL);
		
		List<String> sList = StringList.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(sList);
		
		// we can use Collections class sort method for soting as well
		//Collections.sort(intList);
		
		ArrayList<String> bags = new ArrayList<>();
		bags.add("Pencil");
		bags.add("Books");
		bags.add("Rubber");
		bags.add("QuestionPaper");
		
		ArrayList<String> box = new ArrayList<>();
		box.add("Pencil");
		box.add("Pen");
		box.add("Papar");
		box.add("Books");
		box.add("Rubber");
		
		System.out.println("Before retain All Bags: "+bags);
		System.out.println("Before retain All box:  "+box);
		
		box.retainAll(bags);
		
		System.out.println("After retain All "+bags);
		System.out.println("After retain All "+box);
		
		
		
	}

}
