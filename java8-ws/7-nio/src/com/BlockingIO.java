package com;

import java.util.Scanner;

public class BlockingIO extends Thread {

	Scanner sc = new Scanner(System.in);

	@Override
	public void run() {
		readInput();
	}

	void readInput() {
		System.out.println("Input a number: ");
		int x = sc.nextInt();
	}

	public static void main(String[] args) {

		// module 1 .. take input
		BlockingIO bi=new BlockingIO();
		bi.start();

		// module 2 .. get employees from database

		System.out.println("... loading employees from db...");

	}

}
