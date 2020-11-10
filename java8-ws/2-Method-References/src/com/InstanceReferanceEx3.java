package com;

import java.util.function.BiFunction;

public class InstanceReferanceEx3 {
	
	public int add(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> adder=new InstanceReferanceEx3()::add;
		System.out.println("Sum: "+adder.apply(100, 200));

	}

}
