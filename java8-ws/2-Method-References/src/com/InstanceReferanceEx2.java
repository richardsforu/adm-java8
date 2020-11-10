package com;

public class InstanceReferanceEx2 {
	
	public void display() {
		System.out.println("-- instance method of InstanceReferanceEx2 class");
	}

	public static void main(String[] args) {
		
		Thread t1=new Thread(new InstanceReferanceEx2()::display);
		t1.start();
		
	}
}
