package com.example.demo.dateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTimeApiEx {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		LocalDate date2 = LocalDate.of(2024, 12, 18);
		System.out.println(date2);
		//Period
		Period p = Period.between(date1, date2);
		System.out.println(p);
		
		LocalTime time1  = LocalTime.now();
		System.out.println(time1);
		LocalTime time2 = LocalTime.of(8, 45);
		//Duration
		Duration d = Duration.between(time1, time2);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,dd,MM");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd,MM,yyyy");
		
		System.out.println(date2.format(formatter));
		System.out.println(date2.format(formatter2));
		
		
	}

}
