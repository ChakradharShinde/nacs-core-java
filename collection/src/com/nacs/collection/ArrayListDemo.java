package com.nacs.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> nameString = new ArrayList<>();
		
		nameString.add("Sanika");
		nameString.add("Surbhi");
		nameString.add("Kajal");
		nameString.add("Rutuja");
		nameString.add("Priyanka");
		nameString.add("Sakshi");
		nameString.add("Shraddha");
		nameString.add("Sakshi");
		nameString.add("Nayan");
		nameString.add("Babita");
		
		nameString.add(3, "Pranali");
		
		List<String> tripList=new ArrayList<>();
		
		tripList.add("Yash");
		tripList.add("Yash");
		tripList.addAll(2,nameString);
		tripList.add("Jay");
//		int index=tripList.lastIndexOf("Sakshi");
//		System.out.println(index);
//		
//		
//		String result=tripList.get(tripList.size()-1);
//		
//		System.out.println(result);
//		
//		tripList.remove(10);
//		
//		tripList.replaceAll(String::toUpperCase);
//		
////		tripList.forEach(System.out::println);
//		
//		tripList.set(tripList.indexOf("JAY"), "VEERU");
//		
//		
//		tripList.sort(Comparable::compareTo);
//		
//		
//		
//		tripList.forEach(System.out::println);
		
//		Iterating Collection object
//		using traditional for loop
//		for(int i=0;i<tripList.size();i++)
//			System.out.println(tripList.get(index));
//		
////		using advanced for loop
//		for(String name:tripList)
//			System.out.println(name);
//		
////		using forEach(Iterable(I)) method
//		tripList.forEach(System.out::println);
		
//		Iterator<String> strIterator = tripList.iterator();
//		
//		while(strIterator.hasNext()) {
////			System.out.println(strIterator.next());
//			String temp=strIterator.next();
//			if(temp.charAt(1)=='a')
//				strIterator.remove();
//			else
//				System.out.println(temp);
//		}
		
//		ListIterator<String> strIterator=tripList.listIterator();
//		
//		while(strIterator.hasNext()) {
//			System.out.println(strIterator.next());
//			strIterator.add("AbC");
//			strIterator.set("");
//			strIterator.remove();
//		}
//		System.out.println("-----------------------------------------------------------");
//		while(strIterator.hasPrevious())
//			System.out.println(strIterator.previous());
		
		
//		Spliterator -> 1. trySplit() 2. tryAdvanced()
		Spliterator<String> spliterator1 = tripList.spliterator();
		
		Spliterator<String> spliterator2 = spliterator1.trySplit();
		
//		while(spliterator1.tryAdvance(str->System.out.println(str))) {}
//		System.out.println("----------------------------------------------------------------");
//		while(spliterator2.tryAdvance(str->System.out.println(str))) {}
		
//		forEachRemaining
		spliterator2.forEachRemaining(str->System.out.println(str.toUpperCase()));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
