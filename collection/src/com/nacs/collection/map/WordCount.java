package com.nacs.collection.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount {
	public static void main(String[] args) {
		String data= 
		"hello from nagar, NACS, nagar is district of Maharashtra, NACS is a popular college in nagar";
		Map<String, Integer> wordCount = new LinkedHashMap<>();
		
		String[] dataArray=data.split("[ ,]+");
		
		for(String element:dataArray)
			wordCount.merge(element, 1, (o,n)->o+1);
		
		System.out.println(wordCount);
		
//		get and getOfDefault
		int count=wordCount.getOrDefault("ABC",0);
		System.out.println(count);
			
		
		boolean count1=wordCount.replace("nagar", 3, 4);
		System.out.println(count1);
		
		System.out.println(wordCount.get("nagar"));
		
//		forEach from Iterator(I)
//		wordCount.forEach((k,v)->System.out.println("key : " + k + ", value : " + v));
		
//		advanced for loop
//		for(Map.Entry<String, Integer> wordFrequency:wordCount.entrySet())
//			System.out.println(wordFrequency.getKey() + " : " + wordFrequency.getValue());
		
//		iterator
//		Iterator<Map.Entry<String, Integer>> wordCountIterator=wordCount.entrySet().iterator();
//		while(wordCountIterator.hasNext()) {
//			Map.Entry<String, Integer> temp = wordCountIterator.next();
//			System.out.println(temp.getKey() + " : " + temp.getValue());
//		}
		
//		iterator using keys only
//		Set<String> wordSet=wordCount.keySet();
//		wordSet.forEach(System.out::println);
//		
//		
//		for(String word:wordSet) 
//			System.out.println(word);
		
//		Iterator<String> wordIterator = wordSet.iterator();
//		while(wordIterator.hasNext())
//			System.out.println(wordIterator.next());
		
//		iterator using values only
		Collection<Integer> values= wordCount.values();
		
//		forEach
//		values.forEach(System.out::println);
		
//		advancedForLoop
//		for(Integer value:values)
//			System.out.println(value);
		
//		Iterator<Integer> valueIterator = values.iterator();
//		while(valueIterator.hasNext())
//			System.out.println(valueIterator.next());
		
	}
}









