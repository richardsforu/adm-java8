package com;

import java.util.ArrayList;
import java.util.List;

public class ParallerForEachDemo {

	public static void main(String[] args) {

		List<String> arr1 = new ArrayList<String>();
		arr1.add("Geeks");
		arr1.add("For");
		arr1.add("Geeks");

		arr1.parallelStream().forEach(s -> {
			System.out.print(s);
		});

	}

}
