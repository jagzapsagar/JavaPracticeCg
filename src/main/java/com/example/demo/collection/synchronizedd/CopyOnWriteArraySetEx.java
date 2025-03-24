package com.example.demo.collection.synchronizedd;

import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetEx {
	public static void main(String[] args) {
		CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
		//HashSet<String> set = new HashSet<>();
		//set.add("abc");
		//set.add("xyz");
		//set.add("ghj");
		
		Thread t1 = new Thread(() -> {
			for(int i=1;i<10;i++) {
				set.add(Thread.currentThread().getName() +" "+ i);
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i=1;i<10;i++) {
				set.add(Thread.currentThread().getName() +" "+ i);
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(set.size());
		System.out.println(set);
		/*
		 * for(String a : set) { set.add("added last"); }
		 */
		
	}

}
