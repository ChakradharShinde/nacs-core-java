package com.nacs.oops.inheritance.main;

import com.nacs.oops.inheritance.subtype.Train;

public class MainTrainVehicle {
	public static void main(String[] args) {
		Train vandeBharat=new Train();
		vandeBharat.setNoOfBoggies(10);
		vandeBharat.setEngine("6500 HP");
		vandeBharat.setNoOfTyres(44);
		
		System.out.println(vandeBharat);
	}
}
