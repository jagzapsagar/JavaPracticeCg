package com.example.demo.practices;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SumFunction {
	public static void main(String[] args) {
		List<Integer> list = List.of(2,8,3,7,1);
		
		int sum =list.stream().mapToInt(e -> e).sum();
		System.out.println(sum);
		
		long count =list.stream().filter(e -> e%2==0).count();
		System.out.println(count);
		
		Optional<Integer> m =list.stream().max(Comparator.naturalOrder());
		System.out.println(m);
	}

}
