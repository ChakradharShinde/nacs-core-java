package com.nacs.oops.abstraction.impl;

import com.nacs.oops.abstraction.ElectricityBill;

public class ResidentialBill implements ElectricityBill{
	@Override
	public float generateBill(int noOfUnits) {
		return noOfUnits*7.23F;
	}
}
