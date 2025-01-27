package com.example.demo.datatypes;

public class DataTypes {
	
	//final String strfinal; // we can do like 
	
	
	public static void main(String[] args) {
		
		byte b = 20;
		short s = 30;
		int i =40;
		long l = 50;
		
		int si = s;
		// Bade se chote main 
		byte ib = (byte) i;
		System.out.println(si);
		System.out.println(ib);
		
		
		float f = 20.30f;
		double d = 40.40d;
		
		//casting
		System.out.println("Floating point");
		float df = (float) d;
		System.out.println(f);
		System.out.println(d);
		System.out.println(df);
		
		char c = 'S';
		boolean boo = true;
		
		String str = "ABC"; // Using String literal
		String strnew = new String("XYZ"); // using constructor
		
		final String strfinal;
		strfinal = "FinalString";
		System.out.println(strfinal);
	}

}
