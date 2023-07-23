package com.elan.intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ElanFilter {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++)
			myList.add(i);
		Stream<Integer> streamList = myList.stream();
		Stream<Integer> streamList1 = streamList.filter(p -> p>80);
		//System.out.println("Steam List : "+streamList1.count());
		streamList1.forEach(p -> System.out.println(p +"values "));
		

	}

}
