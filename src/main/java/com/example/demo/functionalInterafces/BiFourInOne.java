package com.example.demo.functionalInterafces;

import java.util.function.Consumer;
import java.util.function.*;

public class BiFourInOne {
	public static void main(String[] args) {
		
		// Consumer
		Consumer<String> con = ((s) -> System.out.println(s));
		con.accept("Sagar");
		BiConsumer<String, Integer> BiCon = (a,b) -> {
			System.out.println(a+b);
		};
		BiCon.accept("abc", 123);
		
		//Predicate
		BiPredicate<String, String> pr = (a,b) -> a.equals(b);
		System.out.println(pr.test("a", "a"));
		
		//BiSupplier  // Java dosent have bi supplier
		//BiSupplier<String, Integer> BiSup = () -> ("abc",123);
		
		BiFunction<String, Integer, String> BiF = (a,b) -> "abc";
		System.out.println(BiF.apply("abc", 123));
		
		
	}

}
