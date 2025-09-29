package com.nacs.collection.queue.entities;

public class Menu implements Comparable<Menu> {
	private int id;
	private String dish;
	private float price;

	public Menu() {
		
	}

	public Menu(int id, String dish, float price) {
		this.id = id;
		this.dish = dish;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDish() {
		return dish;
	}

	public void setDish(String dish) {
		this.dish = dish;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public int compareTo(Menu menu) {
		return this.dish.compareTo(menu.dish);
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", dish=" + dish + ", price=" + price + "]";
	}

}
