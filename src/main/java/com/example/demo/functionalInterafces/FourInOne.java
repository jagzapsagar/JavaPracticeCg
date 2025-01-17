package com.example.demo.functionalInterafces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FourInOne {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(8);
		list.add(7);
		
		Consumer<Integer> con = ((a) -> System.out.println("Consumer: "+a));
		con.accept(45);
		
		Predicate<Integer> pr = ((b) -> b>5);
		pr.test(22);
		
		Supplier<Integer> sup = (() -> 123);
		
		Function<Integer, Integer> fun = ((c) -> c*c);
		
		List<Integer> fil = list.stream().map(fun).filter(pr).peek(con).map(e -> e*sup.get()).collect(Collectors.toList());
		
		System.out.println(fil);
		}

}
