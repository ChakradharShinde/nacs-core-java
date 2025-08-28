package com.nacs.oops.inheritance.main;

import com.nacs.oops.inheritance.subtype.LocalTrain;

public class MainLocalTrainVehicle {
	public static void main(String[] args) {
		String[] stops = {"CSMT", "DADAR", "THANE", "KALYAN", "KARJAT", "LONAWALA", "PUNE"};
		
		
		LocalTrain central = new LocalTrain();
		central.setNoOfBoggies(12);
		central.setEngine("3000 HP");
		central.setNoOfTyres(-100);
		central.setStops(stops);
		
		System.out.println(central.toString());
		
	}
}
