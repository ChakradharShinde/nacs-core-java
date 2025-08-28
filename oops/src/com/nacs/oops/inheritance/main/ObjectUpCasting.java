package com.nacs.oops.inheritance.main;

import com.nacs.oops.inheritance.subtype.Car;
import com.nacs.oops.inheritance.subtype.LocalTrain;
import com.nacs.oops.inheritance.subtype.Train;
import com.nacs.oops.inheritance.supertype.Vehicle;

public class ObjectUpCasting {
	public static void main(String[] args) {
//		Upcasting super <- sub
		Vehicle vehicle1 = new Train();
//		Upcasting super <- sub
		vehicle1 = new Car();
//		Upcasting super <- sub
		vehicle1=new LocalTrain();
		
		
//		Downcasting sub <- super
		LocalTrain central = (LocalTrain) vehicle1;
		
//		Upcasting super <- sub
		Vehicle vehicle2 = new Train();
		
//		Downcasting sub <- super(only upcasted object can be downcasted)
		Train train1 = (Train)vehicle2;
		train1.setNoOfTyres(1000);
		
		
		
		
		
	}
}
