package com.example.demo.thread;

// StringBuilder not thread safe 
// string buffer thread safe
public class StringBuilderStringBuff {
	public static void main(String[] args) {
		//StringBuilder str = new StringBuilder();
		StringBuffer str = new StringBuffer();
		Thread t1 = new Thread (() -> {
			for(int i=0;i<5000;i++) {
				str.append("a");
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int j=0;j<5000;j++) {
				str.append("b");
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
		
		System.out.println(str.length());
	}
	

}
