package com.example.demo.qulifireprimary;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class QulifireEx {
	public static void main(String[] args) {
		
	}

}
@Component
class Vehicle{
	private final car carr;

	public Vehicle(@Qualifier("electric")car carr) {
		
		this.carr = carr;
	}
	
	public void drive() {
		carr.start();
	}
	
	
}

interface car{
	public String start();
}
@Component
class Electric implements car {

	@Override
	public String start() {
		return "Electric car";
		// TODO Auto-generated method stub
		
	}
	
}
@Component
class petrol implements car{

	@Override
	public String start() {
		return "Petrol Car";
		// TODO Auto-generated method stub
		
	}
	
}
