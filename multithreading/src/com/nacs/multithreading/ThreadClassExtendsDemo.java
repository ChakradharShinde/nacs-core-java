package com.nacs.multithreading;

public class ThreadClassExtendsDemo extends Thread {
	public static void main(String[] args) {
		ThreadClassExtendsDemo thread1 = new ThreadClassExtendsDemo();
		ThreadClassExtendsDemo thread2 = new ThreadClassExtendsDemo();
		thread1.start();
		thread2.start();
		
	}
	
	
	@Override
	public void run() {
		System.out.println("This is Run method.." + Thread.currentThread().getName());
	}
	
}
