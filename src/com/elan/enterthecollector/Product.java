package com.elan.enterthecollector;

public class Product {
	private int id;
	private String name;
	private int weight;
	public Product(int id, String name, int weight) {
		super();
		this.id = id;
		this.name = name;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", weight=" + weight + "]";
	}
	

}
