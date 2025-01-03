package com.example.demo.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionBy {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(5);
		list.add(2);
		list.add(4);
		Map<Boolean, List<Integer>> nl =list.stream().collect(Collectors.partitioningBy(e -> e%2==0));
		nl.forEach((a,b)->{
			System.out.println(a+" "+b);
		});
		
		ArrayList<Emp> elist = new ArrayList<>();
		elist.add(new Emp(2,"Sagar",52000,"male"));
		elist.add(new Emp(3,"Kartik",41000,"male"));
		elist.add(new Emp(4,"Krutika",25000,"female"));
		elist.add(new Emp(5,"Shweta",12000,"female"));
		
		Map<Boolean, List<Emp>> pa =elist.stream().collect(Collectors.partitioningBy(e -> e.getGender()=="male"));
		pa.forEach((k,v) ->{
			System.out.println(k+" "+v);
		});
	}

}
