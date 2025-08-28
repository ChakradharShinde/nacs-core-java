package com.nacs.oops.inheritance.supertype;

public class Vehicle {
	private int noOfTyres;
	private String engine;

	public Vehicle() {}

	public Vehicle(int noOfTyres, String engine) {
		this.noOfTyres = noOfTyres;
		this.engine = engine;
	}

	public int getNoOfTyres() {
		return noOfTyres;
	}

	public void setNoOfTyres(int noOfTyres) {
		System.out.println("this is vehicle class");
		this.noOfTyres = noOfTyres;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Vehicle [noOfTyres=" + noOfTyres + ", engine=" + engine + "]";
	}

}
