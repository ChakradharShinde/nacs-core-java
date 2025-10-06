package com.nacs.collection.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class CollectionsDemo {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		
		intList.add(1);
		intList.add(8);
		intList.add(3);
		intList.add(6);
		intList.add(5);
//		System.out.println(intList);
//		Collections.sort(intList, (e1,e2)->e2-e1);
//		System.out.println(intList);
		
//		int result=Collections.binarySearch(intList, 8);
//		System.out.println(result);
		
//		List | Set | Queue | Map
//		List<Integer> readOnlyList=Collections.unmodifiableList(intList);
//		readOnlyList.add(100);
		
//		List | Set | Queue | Map
//		List<Integer> syncList=Collections.synchronizedList(intList);
		
		
		List<Integer> checkedIntList=Collections.checkedList(intList, Integer.class);
		
//		fail-fast
		
//		Iterator<Integer> iterator = checkedIntList.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//			checkedIntList.add(1000);
//		}
		
		ArrayBlockingQueue<Integer> intQueue = new ArrayBlockingQueue<>(10);
		intQueue.offer(20);
		intQueue.offer(30);
		intQueue.offer(40);
//		fail-safe
		
		Iterator<Integer> iterator = intQueue.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			
			intQueue.offer(100);
		}
		
	}
}
