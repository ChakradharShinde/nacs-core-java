package com.nacs.multithreading;

public class PrintTable extends Thread{
	private int tableNo;

	public PrintTable(int tableNo) {
		this.tableNo = tableNo;
	}

	public void printTable() {
		for (int i = 1; i <= 10; i++)
			System.out.println(tableNo * i);
	}
	
	@Override
	public void run() {
		int result = 10/0;
		printTable();
	}
}
