package com;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		
	//	HashMap<Object, Object> data = new HashMap<>();
		
	//	Collections.synchronizedMap(data);
		
		ConcurrentHashMap<Object, Object> data = new ConcurrentHashMap<>();

		data.put(101, "Abc");
		data.put(102, "Xyz");
		data.putIfAbsent(103, "Test");

		System.out.println(data);

		Set<Object> keySet = data.keySet();

		Iterator<Object> it = keySet.iterator();
		

		Runnable r = () -> {
			System.out.println("Child Thread: " + Thread.currentThread().getName());
			data.replace(102, "Xyz", "New Value");
			data.put(104, "New");
		};

		Thread t1 = new Thread(r, "Runnable Thread");
		t1.start();

		while (it.hasNext()) {
			System.out.println("Waiting for updations....");
			Thread.sleep(5000);
			System.out.println("After Updating Map ");
			//System.out.println("Iteratoer Thread is " + Thread.currentThread().getName());
			Object key = it.next();
			System.out.println(key + " -> " + data.get(key));
		}
		
		//System.out.println(data);

	}

}
