package com;

interface MyInter2{
	void greet();
}
public class InstanceReferanceEx1 {
	
	public void greetMessage() {
		System.out.println("-- Non static method of greetMessage method");
	}
	
	public static void main(String[] args) {
		
		// way -1 
		// 1 - create an object to class
		InstanceReferanceEx1 mr1=new InstanceReferanceEx1();
		// 2- refer a non static method to the created object
		MyInter2 mi2=mr1::greetMessage;
		// 3- invoke interface method using created object/referanced object
		mi2.greet();
		
		// way-2
		
		// 1- create anonymous object
		
		MyInter2 mi3=new InstanceReferanceEx1()::greetMessage;
		// call interface method method on mi3 refarance objec
		mi3.greet();
		
	}
}
