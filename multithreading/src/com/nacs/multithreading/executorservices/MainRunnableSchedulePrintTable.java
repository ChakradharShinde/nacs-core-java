package com.nacs.multithreading.executorservices;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MainRunnableSchedulePrintTable {
	public static void main(String[] args) {
		
		RunnableSchedulePrintTable printTable = new RunnableSchedulePrintTable();
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
//		service.schedule(printTable, 5, TimeUnit.SECONDS);
		
//		service.scheduleAtFixedRate(printTable, 1, 2, TimeUnit.SECONDS);
//		
//		service.schedule(()->{
//			System.out.println("Shutting Down Services..");
//			service.shutdown();
//		}, 10, TimeUnit.SECONDS);
		
		service.scheduleAtFixedRate(printTable, 1, 2, TimeUnit.SECONDS);
		
//		Future<Integer> intvalue=service.schedule(() -> (int) (Math.random()*10), 2, TimeUnit.SECONDS);
//		
//		try {
//			System.out.println(intvalue.get());
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} catch (ExecutionException e) {
//			e.printStackTrace();
//		}
		
		
		
	}
}
