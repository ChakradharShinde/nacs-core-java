package com.nacs.multithreading;

public class ArrayPrinting extends Object implements Runnable {
	private String[] names;

	public ArrayPrinting(String[] names) {
		this.names = names;
	}

	@Override
	public void run() {
		for (int i = 0; i < names.length; i++)
			System.out.println(names[i]);
	}
}
