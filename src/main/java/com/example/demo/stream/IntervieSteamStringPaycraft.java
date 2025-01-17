package com.example.demo.stream;

import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Bean;

public class IntervieSteamStringPaycraft {
	public static void main(String[] args) {
		 String str = "ABCDCDDC";
	       
		 // interviewMistek
	      // str.chars().mapToObject(e -> char (e)).collect.(Collectors.groupingBy(e -> e, Collectors.counting));
	       // Correct
		 Map<Character, Long> map = str.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
	       System.out.println(map);
	       
	      // str.equals(str);
	       //str.hashCode();
	       
	       //String str1 = "abc";
	       //String str2 = "bce";
	       
	       //System.out.println(str1.hashCode());
	      // System.out.println(str2.hashCode());
		 
		 Emp e = new Emp();
		 Emp e2 = new Emp();
		 
		 System.out.println(e.hashCode());
		 System.out.println(e2.hashCode());
		 
		 
	}
	@Bean
	 public Emp bean() {
		 return new Emp();
	 }

}
