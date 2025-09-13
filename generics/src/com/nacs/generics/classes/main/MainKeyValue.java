package com.nacs.generics.classes.main;

import com.nacs.generics.classes.KeyValue;

public class MainKeyValue {
	public static void main(String[] args) {
		KeyValue<Long, String> phoneBook = new KeyValue<>();
		phoneBook.setKey(1234567890L);
		phoneBook.setValue("Ajesh");
		
		System.out.println(phoneBook.getKey() +"->" + phoneBook.getValue());
		
		
		KeyValue<String, String> dictionary = new KeyValue<>();
		
		dictionary.setKey("Play");
		dictionary.setValue("Something in Action");
		
		String word = dictionary.getKey();
		
		String meaning = dictionary.getValue();
		
		System.out.println(word + "->" + meaning);
		
	}
}
