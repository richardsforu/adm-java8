package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIterationExample3 {

	public static void main(String[] args) {

		Product p1 = new Product(10, "Pen", 260);
		Product p2 = new Product(11, "Tap", 1000);
		Product p3 = new Product(12, "Usb", 85000);
		Product p4 = new Product(13, "Book", 1000);
		Product p5 = new Product(14, "Moble", 45000);

		List<Product> products = Arrays.asList(p1, p2, p3, p4, p5);

		// display all products in the list

		products.forEach(product -> {
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getPrice());
			System.out.println("--------------------------");
		});

		System.out.println("===========================================");

		List<Product> filteredproducts = products.stream().map(product -> product).limit(3)
				.collect(Collectors.toList());

		filteredproducts.forEach(product -> {
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getPrice());
			System.out.println("--------------------------");
		});

		double totalProductsPrice = products.stream().mapToDouble(product -> product.getPrice()).sum();

		System.out.println(totalProductsPrice);

		float total = products.stream().map(product -> product.getPrice()).reduce(0.0f, Float::sum);

		System.out.println("Total: " + total);

		double total2 = products.stream().collect(Collectors.summingDouble(prods -> prods.getPrice()));

		System.out.println(total2);

		// min and max prices

		// Copy Product whose price is max
		Product prod = products.stream().max((prod1, prod2) -> prod1.getPrice() > prod2.getPrice() ? 1 : -1).get();

		System.out.println("---------------------------------");
		System.out.println(prod.getPrice());

		// Copy Product whose price is Min

		Product prodObj = products.stream().max((prod1, prod2) -> prod1.getPrice() < prod2.getPrice() ? 1 : -1).get();
		System.out.println("---------------------------------");
		System.out.println(prodObj.getPrice());

		// Counting

		long count = products.stream().map(product -> product).count();

		System.out.println("Count:  " + count);
		
		

	}

}
