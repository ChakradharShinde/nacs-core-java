package com.nacs.logicalprograms;

public class Table {
	int table;
	
	public Table() {
		
	}
	
	public Table(int table) {
		this.table=table;
	}
	
	public int getTable() {
		return table;
	}
	
	public void setTable(int table) {
		this.table=table;
	}
	
	public void printTable() {
		for(int i=1;i<=10;i++)
			System.out.print(table 
							+ " * " 
							+ i 
							+ " = " 
							+ (table*i)
							+"\t"
							);
		System.out.println();
	}
}
