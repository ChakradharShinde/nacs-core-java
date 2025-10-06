package com.nacs.collection.map.shoppingcart;

import java.util.ArrayList;
import java.util.List;

import com.nacs.collection.map.shoppingcart.entities.Product;

public class ProductStore {
	List<Product> productList= new ArrayList<>();
	
	public String addProduct(Product product) {
		return productList.add(product)?"Product Added to Strore..":"Error Occured at store";
	}
	
	
	public Product getProduct(int index) {
		return productList.get(index);
	}
	
	public List<Product> getAllProduct(){
		return productList;
	}
}
