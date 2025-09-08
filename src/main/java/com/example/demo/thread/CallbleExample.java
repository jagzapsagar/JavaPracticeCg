package com.example.demo.thread;
import java.util.concurrent.Callable;

class Test implements Callable<String> {
	 
	 @Override
	public String call() throws Exception{
		 return "returnString";	
	}

}

public class CallbleExample{
	
	public static void main(String[] args) {
		Test obj = new Test();
		//Thread t = new Thread(obj::call());
	}
	
}
