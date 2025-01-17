package com.example.demo.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalDouble;

public class CountSumMinMaxIntegerList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(5);
		list.add(2);
		list.add(4);
		
		long count = list.stream().filter(e -> e%2==0).count();
		System.out.println(count);
		
		int sum = list.stream().mapToInt(e -> e).sum();
		int summethodRe = list.stream().mapToInt(Integer::intValue).sum(); // We can use method reference
		System.out.println("Sum: "+sum);
		
		OptionalDouble average = list.stream().mapToDouble(e -> e).average();
		System.out.println("average: "+average.getAsDouble());
		
		Optional<Integer> min =list.stream().min(Comparator.naturalOrder());
		System.out.println("Min: "+min.get());
		
		
		
		
		
		
	}

}
