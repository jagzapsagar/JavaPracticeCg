package com.example.demo.stream;

import java.util.ArrayList;

public class Average {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(5);
		list.add(2);
		list.add(4);
		
		double asDouble = list.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println(asDouble);
	}

}
