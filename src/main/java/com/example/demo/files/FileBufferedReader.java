package com.example.demo.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileBufferedReader {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String line;
		String path = "D:\\StsGitHub\\filesDatas\\data.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
	}

}
