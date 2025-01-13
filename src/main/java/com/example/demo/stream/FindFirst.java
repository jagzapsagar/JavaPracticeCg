package com.example.demo.stream;

import java.util.ArrayList;
import java.util.Optional;

public class FindFirst {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(11);
		list.add(4);
		list.add(88);
		
		Optional<Integer> no = list.stream().filter(e -> e > 10).findFirst();
		
		no.ifPresent(e -> System.out.println(e));
	}

}
