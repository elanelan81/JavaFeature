package com.elan.enterthecollector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EnterTheCollector {

	public static void main(String[] args) {
		Product door = new Product(1,"Wooden Door",35);
		Product floorPanel = new Product(1,"Floor Panel",10);
		Product window = new Product(1,"Glass window",25);
		
		List<Product> products = new ArrayList<>();
		products.add(door);
		products.add(floorPanel);
		products.add(window);
		products.add(floorPanel);
		products.add(window);
		products.add(floorPanel);
		
	System.out.println(products);
	List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

	// Example 1: Predicate
	Predicate<String> startsWithA = name -> name.startsWith("A");

	List<String> filteredNames = names.stream()
	                                  .filter(startsWithA)
	                                  .collect(Collectors.toList());
	System.out.println(filteredNames); // Output: [Alice]

	// Example 2: Function
	Function<String, Integer> lengthFunction = name -> name.length();

	List<Integer> nameLengths = names.stream()
	                                 .map(lengthFunction)
	                                 .collect(Collectors.toList());
	System.out.println(nameLengths); // Output: [5, 3, 7, 5, 3]
	
	
	List<Integer> numbers = IntStream.rangeClosed(1, 1000000).boxed().collect(Collectors.toList());

	long startTime = System.currentTimeMillis();
	int sum = numbers.stream().reduce(0, Integer::sum);
	long endTime = System.currentTimeMillis();
	System.out.println("Sequential sum: " + sum + " in " + (endTime - startTime) + " ms");

	startTime = System.currentTimeMillis();
	sum = numbers.parallelStream().reduce(0, Integer::sum);
	endTime = System.currentTimeMillis();
	System.out.println("Parallel sum: " + sum + " in " + (endTime - startTime) + " ms");	
	
	
	// Example using Supplier interface
	Supplier<String> messageSupplier = () -> "Hello, world!";
	String message = messageSupplier.get(); // message = "Hello, world!"

	// Example using Consumer interface
	//Consumer<String> messageConsumer = (message) -> System.out.println(message);
	//messageConsumer.accept("Hello, world!"); // prints "Hello, world!" to the console
	
	
	
	List<Integer> numbers1 = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);

	List<Integer> sortedNumbers = numbers1.stream()
	                                      .sorted()
	                                      .collect(Collectors.toList());

	System.out.println(sortedNumbers);
	
	
	
	List<String> words = Arrays.asList("apple", "banana", "cherry");

	List<String> result = words.stream()
	                            .peek(System.out::println)
	                            .filter(s -> s.startsWith("a"))
	                            .peek(System.out::println)
	                            .collect(Collectors.toList());
	
	
	List<Person> people = Arrays.asList(
		    new Person("Alice", 25, 50000),
		    new Person("Bob", 30, 60000),
		    new Person("Charlie", 25, 55000),
		    new Person("Dave", 35, 70000),
		    new Person("Eve", 30, 65000)
		);
	
		Map<Integer, Long> countByAge = people.stream()
		    .collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));

		Map<Integer, Double> avgSalaryByAge = people.stream()
		    .collect(Collectors.groupingBy(Person::getAge, Collectors.averagingInt(Person::getSalary)));


		
		System.out.println("Count by age: " + countByAge);
		System.out.println("Average salary by age: " + avgSalaryByAge);
	}

}
