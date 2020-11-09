package com;

@FunctionalInterface
interface Greeting {

	String greetMe();
}

public class Ex5 {

	public static void main(String[] args) {
		Greeting g1 = () -> {
			// statement 1
			// statement 2
			return "Good Morning";
		};
		
		Greeting g2=()->"Good Afternoon";
		
		System.out.println(g1.greetMe());
		System.out.println(g2.greetMe());
	}

}
