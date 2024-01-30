package com.collection;

public class Product {
	
	private	int id;
	private	String name;
	private	float price;
	private String category;

	public Product() {
	super();
	}

	public Product(int id, String name, float price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}	
}