package com.example.demo.collection.synchronizedd;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyonWriteArrayListEx {
	public static void main(String[] args) {
		// it will trhow an exception while modifying 
		//List<Integer> no = new ArrayList<>(); 
		List<Integer> no = new CopyOnWriteArrayList<>();
		
		no.add(5);
		no.add(8);
		no.add(2);
		
		for(int a: no) {
			
			if(a==8) {
				no.add(10);
			}
			System.out.println(a);
		}
		System.out.println(no);
	}

}
