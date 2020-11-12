package com;

import java.util.HashMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<Object, Object> data=new HashMap<>();
		
		data.put(101, "Abc");
		//data.put(101, "Xyz");
		data.putIfAbsent(101, "Xyz");
		System.out.println(data);
		
		
		
		
	}

}
