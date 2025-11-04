package com.nacs.multithreading.executorservices;

public class RunnablePrintTable implements Runnable {
	private PrintTable table;
	private int tableNo;

	public RunnablePrintTable(PrintTable table, int tableNo) {
		this.table = table;
		this.tableNo = tableNo;
	}

	@Override
	public void run() {
		table.printTable(tableNo);
	}
}
