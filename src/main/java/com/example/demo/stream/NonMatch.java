package com.example.demo.stream;

import java.util.ArrayList;
import java.util.Optional;

public class NonMatch {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Sagar");
		list.add("Aniket");
		list.add("Kishan");
		list.add("zram");
		
		Boolean r =list.stream().noneMatch(e -> e.startsWith("z"));
		System.out.println(r);
	}

}
