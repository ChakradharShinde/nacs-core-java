package com.nacs.multithreading;

public class MainPrintTable {
	public static void main(String[] args) {
		PrintTable table4 = new PrintTable(4);
		PrintTable table5 = new PrintTable(5);
//		table4.printTable();
//		table5.printTable();
		
		table4.start();
		table5.start();
		
		System.out.println("End of main thread");
	}
}
