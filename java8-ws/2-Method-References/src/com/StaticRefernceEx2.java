package com;

public class StaticRefernceEx2 {
	
	public static void info() {
		System.out.println("--- information about thread: "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		Thread t1=new Thread(StaticRefernceEx2::info);
		t1.setName("Passenger-1");
		t1.start();
		
	}

}
