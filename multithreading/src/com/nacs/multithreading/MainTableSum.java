package com.nacs.multithreading;

public class MainTableSum {
	public static void main(String[] args) {
		TableSum table2 = new TableSum(2);
		TableSum table3 = new TableSum(3);
		
		System.out.println(table2.getState());
		
		table2.setName("Table2-Thread");
		
		table2.start();
		table3.start();
		
		table2.start();
		
		try {
		table2.join();
//		table3.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(table2.getState());
		System.out.println("End of Main method");
	}
}






