package com.example.demo.stream;

import java.util.ArrayList;

public class CountEmpArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(5);
		list.add(2);
		list.add(4);
		
		Long c =list.stream().filter(e -> e%2==0).count();
		System.out.println(c);
		
		ArrayList<Emp> elist = new ArrayList<>();
		elist.add(new Emp(2,"Sagar",52000,"male"));
		elist.add(new Emp(3,"Kartik",41000,"male"));
		elist.add(new Emp(4,"Krutika",25000,"female"));
		elist.add(new Emp(5,"Shweta",12000,"female"));
		
		Long lessSalary= elist.stream().filter(e -> e.getSalary()<30000).count();
		System.out.println("Less Salary Emp: "+lessSalary);
	}

}
