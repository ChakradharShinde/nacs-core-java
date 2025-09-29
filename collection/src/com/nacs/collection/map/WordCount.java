package com.nacs.collection.map;

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
			
		
		
	}
}
