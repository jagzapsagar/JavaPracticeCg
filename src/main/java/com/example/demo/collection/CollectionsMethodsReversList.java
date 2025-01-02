package com.example.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsMethodsReversList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(4);
		list.add(8);
		list.add(1);
		list.add(45);
		list.add(71);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("reverse Order: "+list);
		
		//For Min and Max using collections method
		System.out.println("Min: "+Collections.min(list));
		System.out.println("Max: "+Collections.max(list));
		
		//using stream API
		Optional<Integer> min =list.stream().min(Comparator.naturalOrder());
		System.out.println("Min Using Strea Api: "+min.get());
		//using max
		Optional<Integer> minn =list.stream().max(Comparator.naturalOrder());
		System.out.println("Max Using Strea Api: "+minn.get());
		
List<Integer> collect = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
System.out.println("Sorted using Stream natural:"+collect);


List<Integer> collect2 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
System.out.println("Sorted using Stream natural:"+collect2);
	}

}
