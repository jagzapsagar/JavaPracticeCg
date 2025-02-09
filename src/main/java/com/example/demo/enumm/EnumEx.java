package com.example.demo.enumm;

import java.util.EnumMap;

enum days{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY,FRIDAY, SATRDAY;
	//MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class EnumEx {
	public static void main(String[] args) {
		System.out.println(days.THURSDAY);
		
		EnumMap<days, Integer> map = new EnumMap<>(days.class);
		map.put(days.MONDAY, 1);
		map.put(days.SATRDAY, 6);
		
		map.forEach((a,b) -> {
			System.out.println(a+ " "+b);
		});
	}

}
