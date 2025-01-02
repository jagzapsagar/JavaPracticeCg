package com.example.demo.mapE;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayToHashMap {
	public static void main(String[] args) {
		ArrayList<EmpHashMap> list = new ArrayList<>();
		
		HashMap<Integer,String> map = new HashMap<>();
		
		list.add(new EmpHashMap(1,"Sagar"));
		list.add(new EmpHashMap(2,"Rakesh"));
		list.add(new EmpHashMap(3,"Jeevan"));
		System.out.println(list);
		list.forEach(e -> {
			map.put(e.getId(), e.getName());
		});
		System.out.println(map);
		
	}

}
