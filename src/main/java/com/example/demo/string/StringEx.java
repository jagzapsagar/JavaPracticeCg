package com.example.demo.string;

public class StringEx {
	public static void main(String[] args) {
		
		String s1 = new String("sachin");
		String s2 = new String("sachin");
		
		String s3 = "abc";
		String s4 = "abc";
		
		System.out.println(s3==s4); //true
		System.out.println(s1==s2); // false
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.compareTo(s2)); // 0
	}

}
