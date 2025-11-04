package com.nacs.multithreading.executorservices;

public class PrintTable {

	public synchronized void printTable(int tableNo) {
		System.out.println(Thread.currentThread().getName());
		for (int i = 1; i <= 10; i++)
			System.out.println(tableNo * i);
	}

}
