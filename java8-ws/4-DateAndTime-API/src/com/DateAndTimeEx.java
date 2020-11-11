package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTimeEx {
	
	public static void main(String[] args) {
		
		LocalDateTime dateAndTime=LocalDateTime.now();
		System.out.println(dateAndTime);
		dateAndTime=dateAndTime.of(LocalDate.of(1991, 12, 21), LocalTime.of(03, 02)); 
		System.out.println(dateAndTime);
		
		
		
	}

}
