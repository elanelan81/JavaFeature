package com.elan.stream;

public class Employee {
	private int Id;
	private String name;
	private double salar;
	public Employee(int id, String name, double salar) {
		super();
		Id = id;
		this.name = name;
		this.salar = salar;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", salar=" + salar + "]";
	}
	

}
