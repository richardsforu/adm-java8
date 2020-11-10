package com;

interface MyInter3 {

	ConstructorReferanceEx1 greet(String msg);
}

public class ConstructorReferanceEx1 {

	public ConstructorReferanceEx1(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {

		MyInter3 mi3 = ConstructorReferanceEx1::new;
		mi3.greet("Good Moring!");

	}

}
