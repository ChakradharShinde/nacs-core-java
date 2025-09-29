package com.nacs.collection;

import java.util.Iterator;
import java.util.LinkedList;

import com.nacs.collection.entities.ToDo;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<ToDo> toDoList = new LinkedList<>();
		
		toDoList.add(new ToDo(1,"Wake Up", "4:00 am"));
		toDoList.add(new ToDo(2,"Get Ready for Study", "5:00 am to 6:00 am"));
		toDoList.add(new ToDo(3,"Study Time", "6:00 am to 6:05 am"));
		toDoList.add(new ToDo(4,"College", "8:00 am to 5:30 am"));
		
		toDoList.add(3, new ToDo(5,"Breakfast", "6:10 am to 8:00 am"));
		
		toDoList.addFirst(new ToDo(6, "Set Alarm", ""));
		
//		Traditional for loop
//		for(int i=0; i<toDoList.size(); i++)
//			System.out.println(toDoList.get(i));
		
		
//		Advanced for loop
//		for(ToDo e:toDoList)
//			System.out.println(e);
		
//		forEach
//		toDoList.forEach(System.out::println);
		
//		Iterator
//		Iterator<ToDo> itr=toDoList.iterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
		
		
		
//		ListIterator
//		ListIterator<ToDo> listItr=toDoList.listIterator();
//		while(listItr.hasNext())
//			System.out.println(listItr.next());
		
		
//		DescendingIterator
//		Iterator<ToDo> descendingItr=toDoList.descendingIterator();
//		while(descendingItr.hasNext())
//			System.out.println(descendingItr.next());
		
		
		
//		 implementation of Object class equals method return this==obj **
		System.out.println(toDoList.contains(new ToDo(5,"Breakfast", "6:10 am to 8:00 am")));
	}
	
	
	
	
	
	
	
	
	
	
}
