package com.example.demo.designePattern;

interface Animal{
	void speek();
}

 class Dog implements  Animal {

	@Override
	public void speek() {
		System.out.println("Wooow");
		
	}
	 
 }
 
 class Cat implements Animal{

	@Override
	public void speek() {
		System.out.println("Meeeeeww");
		
	}
	 
 }
 
 class AnimalFactory{
	 public Animal getAnimal(String typ) {
		 if(typ.equals("dog")) {
			return new Dog();
		 }else if(typ.equals("cat")) {
			 return new Cat();
		 }
		return null;
	 }
 }
public class FactoryDesigne {
	
	public static void main(String[] args) {
		AnimalFactory af = new AnimalFactory();
		Animal a = af.getAnimal("cat");
		a.speek();
		Animal d = af.getAnimal("dog");
		d.speek();
	}

}
