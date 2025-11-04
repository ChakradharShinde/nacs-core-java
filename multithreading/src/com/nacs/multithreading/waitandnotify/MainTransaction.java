package com.nacs.multithreading.waitandnotify;

public class MainTransaction {
	public static void main(String[] args) {
		Transaction transaction = new Transaction(1000);

		Thread producer = new Thread(() -> {
			for (int i = 0; i < 5; i++)
				transaction.withdraw(100);
		});

		Thread consumer = new Thread(() -> {
			for (int i = 0; i < 5; i++)
				transaction.deposit(100);
		});

		producer.start();

		consumer.start();

		
	}

}
