package com.elan.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapElan {

	public static void main(String[] args) {
		Stream<List<String>> listName = Stream.of(
				Arrays.asList(""),
				Arrays.asList("ABC","BBB"),
				Arrays.asList("1234"));

		Stream<String> output = listName.flatMap(input ->input.stream());
		output.forEach(System.out::println);
	}

}
