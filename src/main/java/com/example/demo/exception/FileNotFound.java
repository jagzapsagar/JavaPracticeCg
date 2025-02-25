package com.example.demo.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {
	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("/abc/xyz.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
