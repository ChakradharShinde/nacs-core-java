package com.nacs.multithreading;

public class MainArrayPrinting {
	public static void main(String[] args) {
		String[] names = {"Rohit","Vaibhav","Sanika","Surabhi"};
		
//		ArrayPrinting runnable1 = new ArrayPrinting(names);
//		ArrayPrinting runnable2 = new ArrayPrinting(names);
//		Anonymous Class
		Runnable runnable1 = new Runnable() {
			public void run() {
				for(int i=0;i<names.length;i++)
					System.out.println(names[i]);
			}
		};
		
		Runnable runnable2 = ()-> {
					for(int i=0;i<names.length;i++) 
						System.out.println(names[i]);
			};
		
		
		
		
//		New State
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		
		
		new Thread(()->{
			for(int i=0;i<names.length;i++)
				System.out.println(names[i]);
		}).start();
		
//		Runnable State
		thread1.start();
		thread2.start();
//		thread3.start();
	}
}
