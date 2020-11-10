package com;

@FunctionalInterface
interface MyInter1 {
	void greet();
	//void f1();
}

public class StaticRefernceEx1 {
	
	public static void greetMessage() {	
		System.out.println("-- This is static method of greetMessage  method");
	}
	
	public static void main(String[] args) {
		// Referencing a static method
		MyInter1 mi1=StaticRefernceEx1::greetMessage;
		mi1.greet();
	}

}
