package com.example.demo.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindDigitStartWithZero {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(17);
		list.add(45);
		list.add(12);
		list.add(74);
		list.add(11);
		
		list.stream().map(e -> e+ "").filter(e -> e.startsWith("1")).forEach(System.out::println);
		//System.out.println(collect);
	}

}
