package com.nacs.multithreading.synchronization;

public class RunnablePrintTable implements Runnable{
	private PrintTable printTable;
	private int tableNo;
	
	public RunnablePrintTable(PrintTable printTable, int tableNo) {
		this.printTable = printTable;
		this.tableNo = tableNo;
	}
	
	@Override
	public void run() {
//		synchronized(this) {
			printTable.printTable(tableNo);
//		}
	}
	
}
