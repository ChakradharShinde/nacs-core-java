package com.nacs.collection.set;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

import com.nacs.collection.set.entities.Book;

public class MainBook {
	public static void main(String[] args) {
		Comparator<Book> priceComparator = (b1,b2)-> (int)(b1.getPrice()-b2.getPrice());
		
		
		NavigableSet<Book> bookSet = new TreeSet<>(priceComparator);
		
		bookSet.add(new Book(1,"Let Us C", 200));
		bookSet.add(new Book(2,"Head First Java", 260));
		bookSet.add(new Book(3,"Spring Cook Book", 360));
		bookSet.add(new Book(4,"Mysql", 290));
		
//		bookSet.forEach(System.out::println);
			
//		SortedSet<Book> headSet=bookSet.headSet(new Book(0,null,200),true);
//		
//		headSet.forEach(System.out::println);
		
		
//		Book result=bookSet.higher(new Book(0,"", 200));
		
		Book result=bookSet.floor(new Book(0,"", 300));
		
		
		System.out.println(result);
	}
}
