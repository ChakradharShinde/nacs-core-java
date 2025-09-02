package com.nacs.oops.abstraction.main;

import com.nacs.oops.abstraction.ElectricityBill;
import com.nacs.oops.abstraction.impl.IndustrialBill;
import com.nacs.oops.abstraction.impl.ResidentialBill;

public class MainElectricityBill {
	public static void main(String[] args) {
//		ElectricityBill bill1 = new IndustrialBill();
//		System.out.println(bill1.generateBill(100));
//		bill1.printBill(100);
//		
//		ElectricityBill bill2 = new ResidentialBill();
//		System.out.println(bill2.generateBill(100));
//		bill2.printBill(100);
		
		ElectricityBill smallCap = new ElectricityBill() {
			@Override
			public float generateBill(int units) {
				return units*25.50F;
			}
		};
		
		smallCap.printBill(100);
	}
	
	
	
	
	
	
	
	
	
}
