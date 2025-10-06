package com.nacs.collection.map;

import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		SortedMap<Integer, String> numberSpell = new TreeMap<>();

		numberSpell.put(1, "One");

		numberSpell.put(2, "Two");

		numberSpell.put(3, "Three");

		numberSpell.put(4, "Four");

		numberSpell.put(5, "Five");

		System.out.println(numberSpell);

		int firstElement = numberSpell.firstKey();

		int lastElement = numberSpell.lastKey();

		SortedMap<Integer, String> oneToThree = numberSpell.headMap(4);

		oneToThree.remove(3);

		System.out.println(oneToThree);

		System.out.println(numberSpell);

		Iterator<Map.Entry<Integer, String>> oneToThreeIterator = oneToThree.entrySet().iterator();
		while (oneToThreeIterator.hasNext()) {
			Map.Entry<Integer, String> element = oneToThreeIterator.next();
			System.out.println(element.getKey() + " : " + element.getValue());
		}

		Iterator<Integer> keyIterator = oneToThree.keySet().iterator();
		while (keyIterator.hasNext()) {
			Integer result = keyIterator.next();

			System.out.println(result);
		}
	}
}
