package com.example.demo.designePattern;
class SingleTonEx{
	private static SingleTonEx Intanc;
	private SingleTonEx() {
		super();
	}
	public static SingleTonEx getIntance() {
		if(Intanc==null) {
			Intanc = new SingleTonEx();
		}
		return Intanc;
	}
}
public class SingltonPattern {
	public static void main(String[] args) {
		SingleTonEx obj1 = SingleTonEx.getIntance();
		SingleTonEx obj2 = SingleTonEx.getIntance();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
	}

}
