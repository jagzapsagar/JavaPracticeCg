package com.example.demo.designePattern;

class SingletonT{
	private static SingletonT singletonEx;
	
	private SingletonT() {
		
	}
	
	public static SingletonT getinstance() { // Method to get Singleton instance
		
		if(singletonEx==null) {  // First check (outside synchronized block)
			synchronized(SingletonT.class){ // Locking the class
				if(singletonEx==null) {// Second check (inside synchronized block)
					singletonEx = new SingletonT();// Creating the singleton instance
				}
			}
		}
		return singletonEx;
		
	}
}
public class ThreadSafeSinglton {
	public static void main(String[] args) {
		
	}

}
