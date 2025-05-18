package com.example.demo.string;

import com.example.demo.interfaces.main;

public class StringBuilderEx {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("abc");
		str.append("xyz");
		System.out.println(str);
		str.insert(2, 'B');
		System.out.println(str);
		System.out.println(str.substring(2, 4));
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
	}

}
