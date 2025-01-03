package com.example.demo.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalDouble;

public class SumFinction {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(5);
		list.add(2);
		list.add(4);
		
		Integer sum =list.stream().mapToInt(e -> e).sum();
		System.out.println(sum);
		
		int sum2 = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum2);
		
		Double avg = list.stream().mapToInt(e -> e).average().orElse(0.0);
		
		Optional<Integer> min =list.stream().min(Comparator.naturalOrder());
		System.out.println("Min: "+min);
		
		Optional<Integer> max = list.stream().max(Comparator.naturalOrder());
		System.out.println("Max: "+max);
	}

}
