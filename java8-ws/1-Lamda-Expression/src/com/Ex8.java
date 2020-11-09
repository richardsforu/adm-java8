package com;

import java.util.Comparator;

public class Ex8 {
	
	
	public static void main(String[] args) {
		
	
		
		// old and bad code
		Runnable r=new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+" is running..");	
			}
		};
		
		Thread t1=new Thread(r,"Passenger1");
		t1.start();
		
		// new and refactored code
		Runnable r2=()->{
			System.out.println(Thread.currentThread().getName()+" is running..");
		};
		
		Thread t2=new Thread(r2,"Passenger2");
		t2.start();
		
		
		
	}

}
