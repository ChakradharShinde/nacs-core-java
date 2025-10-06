package com.nacs.collection.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class FruitCountSortedOrder {
	public static void main(String[] args) {
		String[] fruits = {
				"Apple", 
				"Banana", 
				"Orange", 
				"Strawberry", 
				"Apple",
				"Banana",
				"Strawberry",
				"Banana",
				"Apple",
				"Apple"
				};
		
		NavigableMap<String, Integer> fruitCount = new TreeMap<>();
		
		for(int i=0;i<fruits.length;i++) {
//			fruitCount.computeIfPresent(fruits[i], (k,v)->v+1);
//			fruitCount.computeIfAbsent(fruits[i], k->1);
			
			fruitCount.merge(fruits[i], 1, (o,n)->o+1);
		}
			
		System.out.println(fruitCount);
			
//		Map.Entry<String, Integer> firstFruit=fruitCount.firstEntry();
//		
//		System.out.println(firstFruit.getKey() + " : " + firstFruit.getValue());
		
		Map.Entry<String, Integer> ceilingEntry= fruitCount.floorEntry("Canana");
		System.out.println(ceilingEntry.getKey() + " : " + ceilingEntry.getValue());
		
		
		String lowerKey=fruitCount.lowerKey("Strawberry");
		
		System.out.println(lowerKey);
		
		Map.Entry<String, Integer> deletedEntry = fruitCount.pollFirstEntry();
		
		System.out.println(deletedEntry.getKey() + " : " + deletedEntry.getValue());
		
		System.out.println(fruitCount);
		
		SortedMap<String, Integer> headMap= fruitCount.headMap("Orange",false);
		System.out.println(headMap);
		
		
		
//		SortedMap<String, Integer> subMap = fruitCount.subMap("Banana",false, "Strawberry",true);
//		
//		System.out.println(subMap);
		
//		Set<String> reverseFruits = fruitCount.descendingKeySet();
//		
//		System.out.println(reverseFruits);
		
		
		NavigableMap<String, Integer> descendingMap = fruitCount.descendingMap();
		
		
		Iterator<Entry<String, Integer>> iterator = descendingMap.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Entry<String, Integer> element = iterator.next();
			System.out.println(element.getKey() + " : " + element.getValue());
		}
	}
}