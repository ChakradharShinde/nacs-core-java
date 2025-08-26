package com.nacs.logicalprograms.main;
import com.nacs.logicalprograms.Table;
public class MainTable {
	public static void main(String[] args) {
		Table table = new Table();
		for(int i=1;i<=100;i++) {
			table.setTable(i);
			table.printTable();
			if(i%10==0)
				System.out.println();
		}
	}
}
