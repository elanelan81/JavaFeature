package com.elan.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ElanStream {

	public static void main(String[] args) {
		 Employee[] arrayOfEmps = {
			    new Employee(1, "Jeff Bezos", 100000.0), 
			    new Employee(2, "Bill Gates", 200000.0), 
			    new Employee(3, "Mark Zuckerberg", 300000.0)
			};

			System.out.println("value : "+Stream.of(arrayOfEmps).count());
			
			List<Employee> empList = Arrays.asList(arrayOfEmps);
			System.out.println("empList : "+empList);
			System.out.println("empList : "+empList.stream().count());

	}

	//
	/*
	 Filter - Remove Elements from the Stream that don't match a predicate
	 Map - Transform elements from one value into another  - empList.map(Employee::getName();
	 
	 
	 1.We can use Stream.of() to create a stream from similar type of data. For example, 
	 we can create Java Stream of integers from a group of int or Integer objects.
	 
	 2.We can use Stream.of() with an array of Objects to return the stream. 
	 Note that it doesn’t support autoboxing, so we can’t pass primitive type array.
	 
	 3.We can use Collection stream() to create sequential stream and parallelStream() to create parallel stream.
	 4. We can use Stream.generate() and Stream.iterate() methods to create Stream.
	 5. Using Arrays.stream() and String.chars() methods.
	 
	 Converting Java Stream to Collection or Array
	  	
	 
	  
	 */
	
}
