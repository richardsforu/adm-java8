package com;

import java.time.LocalDate;

public class DateExample {
	
	public static void main(String[] args) {
		
		
		//SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");	
		
		LocalDate date=LocalDate.now();
	
		System.out.println(date);
		
		// edit date
		
		date=LocalDate.of(2020, 8, 11);
		
		System.out.println(date);
		
		
		
		
	}

}
