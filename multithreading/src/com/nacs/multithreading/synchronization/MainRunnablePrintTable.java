package com.nacs.multithreading.synchronization;

public class MainRunnablePrintTable {
	public static void main(String[] args) {
		PrintTable table = new PrintTable();
		
//		RunnablePrintTable runnable1 = new RunnablePrintTable(table, 5);
//		RunnablePrintTable runnable2 = new RunnablePrintTable(table, 7);
//		RunnablePrintTable runnable3 = new RunnablePrintTable(table, 9);
		
//		new State
		Thread thread1 = new Thread(()->table.printTable(5));
		Thread thread2 = new Thread(()->	table.printTable(7));
		Thread thread3 = new Thread(()->	table.printTable(9));
		
		
//		Runnable state
		thread1.start();
		thread2.start();
		thread3.start();
		
	}
}
