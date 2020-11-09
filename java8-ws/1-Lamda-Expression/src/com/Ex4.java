package com;

@FunctionalInterface
interface Booking {

	void book(int seats);
}

public class Ex4 {

	public static void main(String[] args) {

		Booking b1 = (seats) -> {
			System.out.println("Bookiong number of seats: " + seats);
		};
		Booking b2 = (seats) -> {
			System.out.println("Bookiong number of seats: " + seats);
		};

		b1.book(65);
		b2.book(10);
	}

}
