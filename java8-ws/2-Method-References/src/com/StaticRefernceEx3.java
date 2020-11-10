package com;

import java.util.function.BiFunction;

public class StaticRefernceEx3 {

	public static int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> adder = StaticRefernceEx3::sum;
		int result = adder.apply(100, 200);
		System.out.println("Sum: " + result);

	}

}
