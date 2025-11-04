package com.nacs.multithreading;

public class RunnableInterfaceImplementsDemo implements Runnable {

	private String name;

	public RunnableInterfaceImplementsDemo(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		RunnableInterfaceImplementsDemo runnable1 = new RunnableInterfaceImplementsDemo("Om");
		RunnableInterfaceImplementsDemo runnable2 = new RunnableInterfaceImplementsDemo("Pratik");
//		new State
		Thread thread1 = new Thread(runnable1);
		
		Thread thread2 = new Thread(runnable2);
		
		
		
//		Runnable State
		thread1.start();
		thread2.start();
	}

}









