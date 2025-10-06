package com.nacs.collection.map.shoppingcart;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Scanner;

import com.nacs.collection.map.shoppingcart.entities.Product;

public class App {
	public static void main(String[] args) {
		start();
	}

	public static void start() {
		int choice = 0;
		
		ProductStore store = new ProductStore();
		Cart cart = new Cart();
		try (Scanner scanner = new Scanner(System.in)) {
			do {
				choice = printMenu(scanner);
				switch (choice) {
				case 1 -> {
					Product product = new Product();
					System.out.println("Enter Product Id: ");
					int id = scanner.nextInt();
					product.setId(id);
					System.out.println("Enter Product Name: ");
					scanner.nextLine();
					String name = scanner.nextLine();
					product.setName(name);
					System.out.println("Enter Product Price: ");
					float price = scanner.nextFloat();
					product.setPrice(price);
					System.out.println("Enter Product Specification: ");
					scanner.nextLine();
					String specification = scanner.nextLine();
					product.setSpecification(specification);
					System.out.println(store.addProduct(product));
				}
				case 2 -> {
//					store.getAllProduct().forEach((p) -> System.out.println("sr no. " + (i++) + " " + p));
					List<Product> productList=store.getAllProduct();
					for(int i=0;i<productList.size();i++) {
						System.out.println("index: " + i + " Product: " + productList.get(i));
					}
					
					System.out.println("Enter Index number: ");
					int index = scanner.nextInt();
					Product product1=store.getProduct(index);
					
					System.out.println(cart.addToCart(product1));
				}
				case 3->{
					NavigableMap<Product, Integer> cart2 = cart.getCart();
					Iterator<Entry<Product, Integer>> iterator = cart2.entrySet().iterator();
					
					while(iterator.hasNext()) {
						Entry<Product, Integer> temp = iterator.next();
						System.out.println(temp.getKey() + " " + temp.getValue() + " " + (temp.getKey().getPrice()*temp.getValue()));
					}
					double total=cart2.entrySet().stream()
							.mapToDouble(e->e.getKey().getPrice()*e.getValue())
							.sum();
					
					System.out.println("total = " + total);
				}
				}

			} while (choice != 0);
		}
	}

	public static int printMenu(Scanner scanner) {
		System.out.println("1. Add Product to Store");
		System.out.println("2. Add Product to Cart");
		System.out.println("3. Print Cart");
		System.out.println("0. Exit");
		return scanner.nextInt();
	}
}
