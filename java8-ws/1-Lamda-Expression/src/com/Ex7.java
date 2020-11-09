package com;

import java.util.ArrayList;
import java.util.List;

public class Ex7 {
	
	public static void main(String[] args) {
		
		
		List<Integer> numbers=new ArrayList<>();
		numbers.add(19);
		numbers.add(87);
		numbers.add(12);
		numbers.add(82);
		numbers.add(32);
		
		/*
		for(int i=0;i<numbers.size();i++) {
			System.out.println(numbers.get(i));
		}
		*/
		
		
		/*
		for(Integer num:numbers) {
			System.out.println(num);
		}
		*/
		
		numbers.forEach(number->{
			System.out.println(number);
		});
		
		
		
		
	}

}
