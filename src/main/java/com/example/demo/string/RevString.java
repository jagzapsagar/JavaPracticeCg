package com.example.demo.string;

public class RevString {
	public static void main(String[] args) {
		String str = "Welcome";
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);
		
		String str2 = "capgemini";
		String reduce = str2.chars().mapToObj(e -> String.valueOf((char)e)).reduce("",(a,b) -> b + a);
		System.out.println(reduce);
		
		//using shifting
		System.out.println("using shifting");
		String s = "abc";
		char[] ar = s.toCharArray();
		
		for(int i=0;i<(s.length()/2);i++) {
				char temp = ar[i];
				ar[i] = ar[s.length()-i-1];
				ar[s.length()-i-1] = temp;
		}
		
		s = new String(ar);
		System.out.println(s);
		

		
		
	}

}
