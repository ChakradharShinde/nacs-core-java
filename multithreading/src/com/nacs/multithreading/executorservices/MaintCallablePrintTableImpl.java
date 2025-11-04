package com.nacs.multithreading.executorservices;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MaintCallablePrintTableImpl {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CallablePrintTable printTable = new CallablePrintTable();

		ExecutorService services = Executors.newFixedThreadPool(3);

		for (int i = 0; i < 10; i++) {
			Future<Integer> intValue = services.submit(new CallablePrintTableImpl());

			int no = intValue.get();

			printTable.printTable(no);
		}

		services.shutdown();
	}
}
