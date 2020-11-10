package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class StreamFilterEx2 {

	public static void main(String[] args) {
		
		Product p1=new Product(10, "Pen", 150);
		Product p2=new Product(11, "Tap", 873);
		Product p3=new Product(12, "Usb", 1200);
		Product p4=new Product(13, "Book", 230);
		Product p5=new Product(14, "Moble", 450000);
		
		List<Product> products=Arrays.asList(p1,p2,p3,p4,p5);
		
		// apply stream api to filter products who's price is >=1000 and copy to anoter list
		
		List<Product> filteredProds= products.stream()
		.filter(prod->prod.getPrice()>=1000) // entire product object is mapped
		.collect(Collectors.toList());
		
		// filter whose produt price is above 1000 and copy price only
		
		List<Float> priceFilter=products.stream()
				.filter(product->product.getPrice()>=1000)
				.map(product->product.getPrice())
				.collect(Collectors.toList());
		
		
		// display filtered data
		
		for(Product prod:filteredProds) {
			System.out.println(prod.getId());
			System.out.println(prod.getName());
			System.out.println(prod.getPrice());
			System.out.println("-----------------------------");
		}
		
		System.out.println("===============================");
		
		for(float price:priceFilter) {
			System.out.println(price);
		}
		

		
		
	}

}
