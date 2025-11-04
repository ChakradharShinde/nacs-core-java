package com.nacs.multithreading.synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class StringBuilderDemo implements Runnable {
	private StringBuilder log;
	Lock lock = new ReentrantLock();

	public StringBuilderDemo(StringBuilder log) {
		this.log = log;
	}
 
	@Override
	public void run() {
		synchronized (log) {
			for (int i = 0; i < 3; i++) {
				String entry = Thread.currentThread().getName() + " Iteration - " + i + "\n";
				log.append(entry);
			}
		}
	}

}
