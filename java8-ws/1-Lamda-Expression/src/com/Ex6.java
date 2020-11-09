package com;

import java.util.Scanner;

interface Operations {
	 int calculate(int x, int y);
}

public class Ex6 {

	public static void main(String[] args) {

		
		
		Operations sum = (num1, num2) -> num1 + num2;
		Operations diff = (num1, num2) -> num1 - num2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 nos: ");
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		
		System.out.println(sum.calculate(x, y));
		System.out.println(diff.calculate(200, 50));

	}

}
