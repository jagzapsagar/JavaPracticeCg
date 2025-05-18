package com.example.demo.interfaces;

interface sum{
	void sum(int a, int b);
	}

class test implements sum{
	@Override
	public void sum(int a, int b){
	System.out.println(a+b);
}
}

public class main{
	public static void main(String[] args){
	//sum s = (a,b) -> System.out.println(a+b);
	//s.sum(10,20);
		
		test t = new test();
		t.sum(40,50);
}}
