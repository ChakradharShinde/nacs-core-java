package com.nacs.multithreading.executorservices;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFuture {
	public static void main(String[] args) {
		Callable<Integer> callable = () -> (int) (Math.random() * 100);
		try (ExecutorService service = Executors.newSingleThreadExecutor();) {

			for (int i = 0; i < 10; i++) {

				Future<Integer> intValue = service.submit(callable);

				try {
					System.out.println(intValue.get());
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (ExecutionException e) {
					e.printStackTrace();
				}
			}
		}
//		service.shutdown();

	}
}
