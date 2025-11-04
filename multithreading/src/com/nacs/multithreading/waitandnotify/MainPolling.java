package com.nacs.multithreading.waitandnotify;

public class MainPolling {
	public static void main(String[] args) {
		String[] names = {"Babita", "Om", "Yash", "Priyanka", "Sakshi", "Yash"};
		Polling polling  = new Polling();
		
		Thread consumer = new Thread(()->{
			for(int i=0;i<names.length;i++) {
//				System.out.println("Set Name " + names[i]);
				polling.setName(names[i]);
			}
		});
		
		Thread producer = new Thread(()->{
			for(int i=0;i<names.length;i++)
				polling.getName();
		});
		
		consumer.start();
		producer.start();
	}
}
