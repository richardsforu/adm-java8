package com;

import java.time.LocalTime;

public class TimeExample {
	
	public static void main(String[] args) {
		
		LocalTime time=LocalTime.now();
		
		System.out.println(time);
		
		//long ms=System.currentTimeMillis();
		
		//System.out.println(ms);
		
		time=LocalTime.of(23, 12);
		
		System.out.println(time);
		
		
	}

}
