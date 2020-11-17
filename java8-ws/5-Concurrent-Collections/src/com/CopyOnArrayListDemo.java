package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Object> a1 = new ArrayList<>();
		
		a1.add("A");
		a1.add("B");
		
		CopyOnWriteArrayList<Object> coal=new CopyOnWriteArrayList<>();
		coal.add("A");
		coal.add("C");
		

		ArrayList<Object> a2 = new ArrayList<>();
		a2.add("A");
		a2.add("D");
		
		//a1.addAll(a2);
		
		//coal.addAll(a1);
		//coal.addAll(a2);
		coal.addAllAbsent(a1);
		coal.addAllAbsent(a2);
		
		//Set s=new HashSet<>(a1);
		
		//System.out.println(s);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(coal);

	}

}
