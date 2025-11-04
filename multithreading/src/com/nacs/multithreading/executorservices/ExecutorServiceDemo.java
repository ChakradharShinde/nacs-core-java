package com.nacs.multithreading.executorservices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
	public static void main(String[] args) {
		Runnable runnable =() -> System.out.println(Thread.currentThread().getName());
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		for(int i=1;i<=5;i++)
			service.execute(runnable);
		
	}
}
