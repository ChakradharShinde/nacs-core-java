package com.nacs.multithreading.synchronization;

public class MainStringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder log = new StringBuilder();

		StringBuilderDemo runnable1 = new StringBuilderDemo(log);
		StringBuilderDemo runnable2 = new StringBuilderDemo(log);

		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);

		thread1.start();
		thread2.start();
		
		try {
		thread1.join();
		thread2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(log);
		
	}
}
