package com.nacs.collection.map.shoppingcart.entities;

public class Product implements Comparable<Product> {
	private int id;
	private String name;
	private float price;
	private String specification;

	public Product() {}

	public Product(int id, String name, float price, String specification) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.specification = specification;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	@Override
	public int compareTo(Product product) {
		return this.id-product.id;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", specification=" + specification + "]";
	}

}
