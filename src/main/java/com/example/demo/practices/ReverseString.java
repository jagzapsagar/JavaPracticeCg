package com.example.demo.practices;

import com.example.demo.interfaces.main;

public class ReverseString {
	public static void main(String[] args) {
		String str = "abcd";
		int len = str.length();
		String revs = "";
		for(int i=len-1;i>=0;i--) {
			revs +=str.charAt(i);
		}
		System.out.println(revs);
		
		
			String str2 = "Yeola";
		  char[] arr = str2.toCharArray(); 
		  int no = arr.length;
		  char[] rev = new char[arr.length];
		  int j=0;
		  for(int i=no-1;i>=0;i--) { 
			  rev[j]=arr[i]; 
			  j++;
			  }
		  
		  for(char c:rev) {
			  System.out.println(c);
		  }
		 
	}

}
