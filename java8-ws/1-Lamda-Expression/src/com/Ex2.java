package com;
interface Calculate {
	void sum();
	void sub();
}

public class Ex2{
	
	public static void main(String[] args) {
		
		Calculate sum=new Calculate() {
			
			@Override
			public void sum() {
				System.out.println("--- Sum");
				
			}
			
			@Override
			public void sub() {
				System.out.println("--- Sub");
			}
		};
		sum.sum();
		sum.sub();
		
	}

}
