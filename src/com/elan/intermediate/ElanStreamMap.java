package com.elan.intermediate;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ElanStreamMap {

	public static void main(String[] args) {
		Stream<String> names = Stream.of("aa","bb","cc");
		System.out.println(names.map(s->{
			return s.toUpperCase();
		}).collect(Collectors.toList()));

	}

}
