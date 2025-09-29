package com.nacs.collection.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

import com.nacs.collection.queue.entities.Devotees;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		
		Comparator<Devotees> byName = (d1,d2)-> d2.getName().compareTo(d1.getName());
		
		Comparator<Devotees> byPriority = (d1,d2)->d2.getPriority()-d1.getPriority();
		
		PriorityQueue<Devotees> devoteeQueue = new PriorityQueue<>(byPriority);
		devoteeQueue.offer(new Devotees("Priyanka", 20, 5));
		devoteeQueue.offer(new Devotees("Kajal", 21, 4));
		devoteeQueue.offer(new Devotees("Rutuja", 19, 6));
		devoteeQueue.offer(new Devotees("Surabhi", 22, 3));
		devoteeQueue.offer(new Devotees("Sanika", 18, 7));
		
		System.out.println(devoteeQueue.poll());
		//devoteeQueue.offer(null);
		
	}
}
