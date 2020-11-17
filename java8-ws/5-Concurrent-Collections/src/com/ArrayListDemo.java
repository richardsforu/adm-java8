package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Object> a1 = new ArrayList<>();
		
		a1.add("A");
		a1.add("B");

		ArrayList<Object> a2 = new ArrayList<>();
		a2.add("A");
		a2.add("D");
		
		a1.addAll(a2);
		
		Set s=new HashSet<>(a1);
		
		System.out.println(s);
		
		System.out.println(a1);
		//System.out.println(a2);

	}

}
