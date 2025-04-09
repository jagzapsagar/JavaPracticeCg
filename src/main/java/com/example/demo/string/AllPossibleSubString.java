package com.example.demo.string;

import java.util.ArrayList;

public class AllPossibleSubString {
	public static void main(String[] args) {
		String str = "abcd";
		ArrayList<String> poss = new ArrayList<>();
		for(int i =0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				poss.add(str.substring(i,j));
			}
		}
		System.out.println(poss);
	}

}
