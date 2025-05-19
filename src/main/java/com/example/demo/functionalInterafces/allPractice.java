package com.example.demo.functionalInterafces;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.*;
import java.util.*;

import com.example.demo.interfaces.main;

public class allPractice {
	public static void main(String[] args) {
		// Consumer
		BiConsumer<String, Integer> BiCon = (a,b) -> System.out.println(a+b);
		BiCon.accept("Hello ", 5);
		
		Consumer<Character> con = a -> System.out.println(a);
		con.accept('B');
		
		// Predicate
		Predicate<Integer> pr = b -> b<5;
		boolean test = pr.test(4);
		System.out.println(test);
		
		BiPredicate<String, String> BiPr = (a,b) -> a.equals(b);
		System.out.println(BiPr.test("abc","abc"));
	}

}
