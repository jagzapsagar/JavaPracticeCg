package com.example.demo.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.demo.interfaces.main;

public class InterviewDublicateElement {
	public static void main(String[] args) {
		// Input: [1,5,4,6,1,7,5,4]
		
		/*List<Integer> list = List.of(1,5,4,6,1,7,5,4);
		
		list.stream().map(e -> e+"").collect(Collectors
				.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue()>1).map(e -> e.getValue())
				.sorted();
				//.collect(Collectors.toMap(t -> t.getKey(), t -> t.getValue()));
		*/
		//System.out.println(collect);s
		
		//Array1: [1,2,4,5,6]
				 
		//Array2: [1,3,6]
		
		
		ArrayList<Integer> list2 = new ArrayList<>( Arrays.asList(1,3,6));
		ArrayList<Integer> list1 = new ArrayList<>( Arrays.asList(1,3,6,4,76,9));
		ArrayList<Integer> list3 = new ArrayList<>();
		
		HashSet<Integer> set = new HashSet<>();
		set.addAll(list1);
		
		
		for(int b: list2) {
			if(set.contains(b)) {
				list3.add(b);
			}
			
			
		}
		
		System.out.println(list3);
		
		
		
	}

}
