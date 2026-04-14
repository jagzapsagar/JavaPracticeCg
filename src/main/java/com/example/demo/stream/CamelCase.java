package com.example.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CamelCase {
	public static void main(String[] args) {
		String str  = "hELLO wELCOME bAck";
		
String collect = Arrays.stream(str.split(" "))
	.map(e -> e.toLowerCase())
	.map(r -> r.substring(0, 1).toUpperCase()+r.substring(1))
	.collect(Collectors.joining(" "));

System.out.println(collect.substring(0, 1).toLowerCase()+collect.substring(1));
	
			 



	}

}
