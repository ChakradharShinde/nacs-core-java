package com.nacs.collection.map.shoppingcart;

import java.util.NavigableMap;
import java.util.TreeMap;

import com.nacs.collection.map.shoppingcart.entities.Product;

public class Cart{
	NavigableMap<Product, Integer> productEntries = new TreeMap<>();
	
	public String addToCart(Product product) {
		productEntries.merge(product, 1, (o,n)->o+1);
		return "product added to Cart";
	}
	
	public NavigableMap<Product, Integer> getCart(){
		return productEntries;
	}
}
