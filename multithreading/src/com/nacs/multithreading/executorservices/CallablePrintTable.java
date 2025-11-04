package com.nacs.multithreading.executorservices;

public class CallablePrintTable {
	public void printTable(int tableNo) {
		for(int i=1;i<=10;i++)
			System.out.println(tableNo*i);
	}
}
