package com.example.demo.functionalInterafces;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierEx {
	public static void main(String[] args) {
		
		Supplier<String> sup = () -> "ABC";
		
		System.out.println(sup.get());
		Supplier<Integer> Isup = () -> 123;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(8);
		list.add(1);
		
		
	}

}
