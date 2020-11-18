package com;

public class Counter extends Thread {

	int count = 1;
	boolean status = false;

	@Override
	public void run() {
		// increment();
		// display();

		changeStatus();
		displayStatus();
	}

	synchronized void changeStatus() { // t1

		System.out.println("Accessing changeStatus method by " + Thread.currentThread().getName());

		try {
			status = true;

			System.out.println(Thread.currentThread().getName() + " is waiting.....");

			Thread.sleep(5000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void displayStatus() {

		System.out.println("Status: " + status + " by " + Thread.currentThread().getName());
	}

	synchronized void increment() {
		System.out.println("Increment by  " + Thread.currentThread().getName());
		count++;
	}

	void display() {
		System.out.println("Count by  " + Thread.currentThread().getName() + " : " + count);
	}

	public static void main(String[] args) throws Exception {

		System.out.println("Parent: " + Thread.currentThread().getName());

		Counter c1 = new Counter();

		Thread t1 = new Thread(c1, "Thread1");
		Thread t2 = new Thread(c1, "Thread2");

		t1.start();
		t2.start();

		// c1.display(); // main

	}

}
