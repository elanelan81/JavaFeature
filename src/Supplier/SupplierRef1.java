package Supplier;

import java.util.function.Supplier;

public class SupplierRef1 {

	public static void main(String[] args) {
		//We are using a lambda expression to implement the message of Supplier
		Supplier<String> value = () ->"Hello i am Supplier Interface";
		System.out.println(value.get());
	}

}
