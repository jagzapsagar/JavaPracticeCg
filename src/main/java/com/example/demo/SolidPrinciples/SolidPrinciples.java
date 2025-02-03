package com.example.demo.SolidPrinciples;

interface BankCards{
	 void Payment(long amt);
}

class DebitCard implements BankCards{

	@Override
	public void Payment(long amt) {
		System.out.println("Debit card: "+amt);
		
	}
	
}

class CreditCard implements BankCards{

	@Override
	public void Payment(long amt) {
		System.out.println("Credit card: "+amt);
		
	}
	
}

public class SolidPrinciples {
	public static void main(String[] args) {
		BankCards B = new CreditCard();
		B.Payment(120);
		
	}

}
