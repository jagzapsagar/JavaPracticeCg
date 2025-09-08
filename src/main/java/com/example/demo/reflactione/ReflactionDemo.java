package com.example.demo.reflactione;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.example.demo.interfaces.main;

class demo{
	private void test(int a) {
		System.out.println(a);
	}
}

public class ReflactionDemo {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		demo d = new demo();
		Method de = demo.class.getDeclaredMethod("test",int.class);
		de.setAccessible(true);
		de.invoke(d, 2);
		
	}

}
