package com.example.demo.string;

public class RevString {
	public static void main(String[] args) {
		String str = "Welcome";
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);
	}

}
