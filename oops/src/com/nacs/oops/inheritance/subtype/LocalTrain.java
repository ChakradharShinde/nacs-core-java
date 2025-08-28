package com.nacs.oops.inheritance.subtype;

import java.util.Arrays;

public class LocalTrain extends Train {
	private String[] stops;

	public LocalTrain() {
	}

	public LocalTrain(String[] stops) {
		super();
		this.stops = stops;
	}

	public String[] getStops() {
		return stops;
	}
	
	public void setNoOfTyres(int noT) {
		System.out.println("This is Local train class");
	}

	public void setStops(String[] stops) {
		this.stops = stops;
	}

	@Override
	public String toString() {
		return "LocalTrain [stops=" + Arrays.toString(stops) + "], " + super.toString();
	}

}
