package com.nacs.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Long> phoneBook = new HashMap<>();
		
		phoneBook.put("Shruti", 123L);
		phoneBook.put("Pranali", 123L);
		
		phoneBook.put("Babita", 789L);
		
		
//		Set<String> names=phoneBook.keySet();
//		
//		System.out.println(names);
//		
//		
//		Collection<Long> numbers=phoneBook.values();
//		
//		numbers.forEach(System.out::println);
//		
//		Set<Map.Entry<String, Long>> entries= phoneBook.entrySet();
//		
//		entries.forEach(e->System.out.println(e.getKey() + " -> " + e.getValue()));
		
		
//		boolean result=phoneBook.remove("Babita",789L);
		
//		System.out.println(result);
		
//		putIfAbsent
//		------------------------------------------------------------------------------
//		putIfAbsent()
//		1. key already present : returns associated Value
//		2. key not present: put new entry returns null Value
//		
//		
//		Long value=phoneBook.putIfAbsent("Priyanka", 321L);
//		
//		System.out.println(value);
//		---------------------------------------------------------------------------------
//		compute()
//		1. key present : updates computed value to the same key and returns the value
//		2. key not present: returns null value
//		3. if BiFunction function return null:  given record will be deleted
		
		
//		Long result=phoneBook.compute("Babita", (k,v)->v+100L);
//		System.out.println(result);
//		
//		
		Map<String, Integer> fruitCount = new HashMap<>();
		
		fruitCount.put("Oranges", 2);
		
		fruitCount.put("PineApple", 3);
		
		fruitCount.put("Mangoes", 5);
		
		fruitCount.put("Dragon Fruit", 3);
		
//		-----------------------------------------------------------------------------
//		computeIfPresent()
//		key present : call BiFunction and updates the non-null value to Current Key
//		key not present: does not call BiFunction and record will not be added and returns null
//		BiFunction returns null : the given key will be deleted from map
		
//		Integer result=fruitCount.computeIfPresent("ABC", (k,v)->v+5);
//		

		
//		------------------------------------------------------------------------------------
//		computeIfAbsent()
//		1. key is Present : associated value will be return
//		2. key is not present : computed value will be associated to current key;
//		3. Bifunction returns null : current entry will be removed
		
		
		Integer result1=fruitCount.computeIfAbsent("Apple", (k)-> 5);
//		
//		System.out.println(result);
//		
//		System.out.println(result1);
		
		
//		-------------------------------------------------------------------------------------
//		merge()
//		1. key present : new value will be merge with old value
//		2. key is not present : new entry will be created and given value will be assigned to Key
//		3. Bifunction return null : given entry will be removed
		
		fruitCount.merge("Apple", 5, (o,n)->o+1);
		
		System.out.println(fruitCount);
		
		
		
	}
}











