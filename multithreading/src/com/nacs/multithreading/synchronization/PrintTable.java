package com.nacs.multithreading.synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintTable {
	private Lock lock = new ReentrantLock();
	
	public synchronized void printTable(int tableNo) {
		
		lock.lock();
		for(int i=1;i<=10;i++)
			System.out.println(tableNo*i);
		lock.unlock();
	}
}
