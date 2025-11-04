package com.nacs.multithreading.waitandnotify;

public class Polling {
	private String name;
	private boolean getterReady = false;

	public synchronized void getName() {
		// false
		while (!getterReady)
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
		// true
		getterReady = false;
		notifyAll();
		System.out.println("Get Name " + name);
	}

	public synchronized void setName(String name) {
		// true
		while (getterReady)
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}

		// false
		
		System.out.println("Set Name " + name);
		this.name = name;
		getterReady = true;
		notifyAll();
	}

}
