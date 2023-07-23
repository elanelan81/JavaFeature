package com.elan.intermediate;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ElanSortedMap {

	public static void main(String[] args) {
		Stream<String> names = Stream.of("abc","dddd","ccc","2333");
		List<String> nameSorted = names.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Sorted : "+nameSorted);
		
		Stream<String> names1 = Stream.of("abc","dddd","ccc","2333");
		List<String> nameSorted1 = names1.sorted().collect(Collectors.toList());
		System.out.println("Sorted : "+nameSorted1);
		

	}

}
