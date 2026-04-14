package com.example.demo.thread;
import java.util.concurrent.Callable;

class Test implements Callable<String> {
	 
	 @Override
	public String call() throws Exception{
		 return "returnString";	
	}

}

public class CallbleExample{
	
	public static void main(String[] args) throws Exception {
		Test obj = new Test();
		String call = obj.call();
		System.out.println(call);
		//Thread t = new Thread(obj::call());
	}
	
}
