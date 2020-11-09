package com;
@FunctionalInterface
interface Shape {
	
	void draw();
	
	default void f1() {
		System.out.println("--- f1 method");
	}
	
	default void f2() {
		System.out.println("--- f2 method");
	}
	
}

public class Ex3 {
	
	public static void main(String[] args) {
		
		
		Shape circle=()->{
			System.out.println("- Drawing circle");
		};
		
		Shape rect=()->{
			System.out.println("- Drawing rect");
		};
		
		circle.draw();
		circle.f1();
		circle.f2();
		rect.draw();
		rect.f1();
		rect.f2();
	}

}
