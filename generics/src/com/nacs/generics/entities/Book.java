package com.nacs.generics.entities;

public class Book implements Comparable<Book>{
	private float price;
	private String name;

	public Book() {
		
	}

	public Book(float price, String name) {
		this.price = price;
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public int compareTo(Book temp) {
//		return (int) ((int)this.price-temp.price);
//		return Float.compare(this.price, temp.price);
		return this.name.compareTo(temp.name);
	}
	
	@Override
	public String toString() {
		return "Book [price=" + price + ", name=" + name + "]";
	}

}
