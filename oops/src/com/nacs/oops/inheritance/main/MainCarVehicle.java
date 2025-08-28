package com.nacs.oops.inheritance.main;

import com.nacs.oops.inheritance.subtype.Car;

public class MainCarVehicle {
	public static void main(String[] args) {
		Car car1 = new Car();
		
		car1.setAutomatic(false);
		car1.setNoOfAirBags(2);
		car1.setEngine("1.2 L");
		car1.setNoOfTyres(10);
		
		System.out.println(car1);
		
		Car car2 = new Car();
		car2.setAutomatic(true);
		car2.setNoOfAirBags(4);
		car2.setEngine("1.5 L");
		car2.setNoOfTyres(-2);
		
		System.out.println(car2);
	}
}
