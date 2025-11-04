package com.nacs.multithreading;

public class TableSum extends Thread{
	private int tableNo;

	public TableSum(int tableNo) {
		this.tableNo = tableNo;
	}
	
	
	public void printTableSum() {
		int sum=0;
		for(int i=1;i<=10;i++)
			sum=sum+tableNo*i;
		
		
		System.out.println(sum);
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		printTableSum();
	}
}
