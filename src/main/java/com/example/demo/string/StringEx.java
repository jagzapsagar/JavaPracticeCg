package com.example.demo.string;

public class StringEx {
	public static void main(String[] args) {
		
		String s1 = new String("sachin");
		String s2 = new String("sachin");
		String s5 = new String("rahul");
		
		String s3 = "abc";
		String s4 = "abc";
		String s6 = "rahul";
		
		System.out.println(s5.equals(s6));
		System.out.println(s3==s4); //true
		System.out.println(s1==s2); // false
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.compareTo(s5)); // 0
		
		System.out.println(s1.length());
		System.out.println(s1.substring(1, 3)); // 1 and 2 index position / till 3rd index
		String con = "ConcatString";
		System.out.println(s1.concat(con));
		System.out.println(s1.toUpperCase());
		
		System.out.println("----------------------------");
		// <---------------->
		// Replace
		String sample = "capgemini mumbai";
		String replace = sample.replace("mumbai", "pune");
		System.out.println("Replace: "+replace);
		//Concat
		String concat = sample.concat(" India");
		System.out.println("Concat: "+concat);
		// Contains
		boolean contains = sample.contains("mumbai");
		System.out.println("Contains: "+contains);
		
		System.out.println("Start with ca: "+sample.startsWith("ca"));
	}

}
