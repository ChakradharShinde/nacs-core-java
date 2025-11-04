package com.nacs.multithreading.executorservices;

public class RunnableSchedulePrintTable implements Runnable{
	
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=1;i<=10;i++)
			System.out.println(5*i);
	}
}
