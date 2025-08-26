package com.nacs.logicalprograms.main;
import com.nacs.logicalprograms.Power;
public class MainPower {
	public static void main(String[] args) {
		Power power = new Power();
		power.setBase(10);
		power.setExponent(2);
		int tempPower=power.calculatePower();
		System.out.println(power.getBase() 
				+ " ^ " 
				+ power.getExponent() 
				+ " = "
				+ tempPower
				);
	}
}
