package com.nacs.multithreading.executorservices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainRunnablePrintTable {
	public static void main(String[] args) {
		PrintTable table = new PrintTable();
		
//		3 Thread
		ExecutorService services = Executors.newSingleThreadExecutor();
		
		for(int i=1;i<=10;i++)
//			submitting 10 task to queue(Blocking queue)
			services.execute(new RunnablePrintTable(table, i));
			
		services.shutdown();
	}
}
