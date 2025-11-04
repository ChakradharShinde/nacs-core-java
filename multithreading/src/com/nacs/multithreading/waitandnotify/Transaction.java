package com.nacs.multithreading.waitandnotify;

public class Transaction {
	private float bankBalance;
	private boolean depositReady = true;

	public Transaction(float bankBalance) {
		this.bankBalance = bankBalance;
	}

	public void deposit(int amount) {
		synchronized (this) {
//			false
			while (!depositReady) {
//				interrupted Exception is Checked Exception 
				try {
					wait();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					e.printStackTrace();
				}
			}
//			true
			bankBalance += amount;
			System.out.println("Amount deposited.. " + bankBalance);
			depositReady = false;
			notifyAll();
		}
	}

	public synchronized void withdraw(int amount) {
//		true
		while (depositReady) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
		}
//		false
		bankBalance -= amount;
		System.out.println("Amount withdrawn.. " + bankBalance);
		depositReady = true;
		notifyAll();
	}
}
