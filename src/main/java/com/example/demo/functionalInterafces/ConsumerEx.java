package com.example.demo.functionalInterafces;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerEx {
	public static void main(String[] args) {
		
		Consumer<String> con = ((a) -> System.out.println(a));
		con.accept("Sagar");
		Consumer<Integer> Icon = ((a) -> System.out.println(a));
		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(8);
		list.add(1);
		
		list.stream().peek(Icon).collect(Collectors.toList());
	}

}
