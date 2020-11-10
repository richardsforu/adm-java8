package com;

import java.util.function.BiFunction;

public class StaticRefernceEx4 {

	public static int add(int a, int b) {
		return a + b;
	}

	public static float add(int a, float b) {
		return a + b;
	}

	public static float add(float a, float b) {
		return a + b;
	}

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> adder1 = StaticRefernceEx4::add;
		BiFunction<Integer, Float, Float> adder2 = StaticRefernceEx4::add;
		BiFunction<Float, Float, Float> adder3 = StaticRefernceEx4::add;
		System.out.println(adder1.apply(100, 200));
		System.out.println(adder2.apply(100, 150.65f));
		System.out.println(adder3.apply(15.98f, 94.34f));

	}
}
