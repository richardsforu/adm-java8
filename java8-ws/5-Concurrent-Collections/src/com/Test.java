package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test extends Thread {

	static List<String> items = new ArrayList<>();

	@Override
	public void run() {

		try {
			System.out.println("--- Adding new Element..");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		items.add("Praveen");
	}

	public static void main(String[] args) throws InterruptedException {

		items.add("Jkh");
		items.add("khkh");
		items.add("gdgd");
		items.add("jjg");
		items.add("gsdggs");

		Test t1 = new Test();
		t1.setName("My-Thread");
		t1.start();

		Iterator<String> it = items.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			Thread.sleep(5000);
			// items.add("AASD");
		}

	}

}
