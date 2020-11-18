package com;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		//ArrayList<String> al=new ArrayList<>();
		
	    CopyOnWriteArrayList<String> al=new CopyOnWriteArrayList<>();
	   // CopyOnWriteArraySet<E>
		
		al.add("A");
		al.add("B");
		
		ListIterator<String> it=al.listIterator();
		
		while(it.hasNext()) {
			String s1=(String)it.next();
			if(s1.equals("A")) {
				al.add("C");
			}
		}
		
		System.out.println(al);
	}

}
