package com.nacs.oops.abstraction.impl;

import com.nacs.oops.abstraction.ElectricityBill;

public class IndustrialBill implements ElectricityBill{
	@Override
	public float generateBill(int units) {
		return units*17.2F;
	}
}
