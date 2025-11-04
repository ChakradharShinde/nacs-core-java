package com.nacs.multithreading.synchronization;

public class DeadLockDemo {
	public static void main(String[] args) {
		String resource1 = "ABC";
		String resource2 = "BBC";

		Thread thread1 = new Thread(() -> {
			synchronized (resource1) {
				System.out.println("Thread1 aquires Resource1");

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				synchronized (resource2) {
					System.out.println("Thread1 aquires Resource2");
				}
			}
		});

		Thread thread2 = new Thread(() -> {
			synchronized (resource2) {
				System.out.println("Thread2 aquired Resource 2");

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					e.printStackTrace();
				}

				synchronized (resource1) {
					System.out.println("Thread2 aquires Resource 1");
				}
			}
		});

		thread1.start();
		thread2.start();
	}
}
