package com;

import java.util.Arrays;
import java.util.List;

public class StreamIterationExample {

	public static void main(String[] args) {

		Product p1 = new Product(10, "Pen", 150);
		Product p2 = new Product(11, "Tap", 873);
		Product p3 = new Product(12, "Usb", 1200);
		Product p4 = new Product(13, "Book", 230);
		Product p5 = new Product(14, "Moble", 450000);

		List<Product> products = Arrays.asList(p1, p2, p3, p4, p5);

		// Iterating elements

		products.stream()
		.filter(product -> product.getPrice() >= 1000)
	    .forEach(product -> System.out.println(product.getName()));

		
		
	}

}
