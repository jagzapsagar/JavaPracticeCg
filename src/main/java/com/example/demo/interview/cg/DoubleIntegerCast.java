package com.example.demo.interview.cg;

import com.example.demo.interfaces.main;

public class DoubleIntegerCast {
	public static void main(String[] args) {
		DoubleIntegerCast d = new DoubleIntegerCast();
		int c = d.calculatePoints(150.6);
		System.out.println(c);
	}
	
	public int calculatePoints(Double amount) {
		int points = 0;
		if (amount > 100) {
			points += (int) (2 * (amount - 100)); //75*2 + 50
			points += 50;
		} else if (amount > 50) {
			points += (int) (amount - 50);
		}
		return points;
	}

}
