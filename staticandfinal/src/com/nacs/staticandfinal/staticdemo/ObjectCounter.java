package com.nacs.staticandfinal.staticdemo;

public class ObjectCounter {
	
	static {
		staticCounter=0;
	}
	
	private static int staticCounter;
	private int nonStaticCounter;
	
	public ObjectCounter() {
		staticCounter++;
		nonStaticCounter++;
	}

	public ObjectCounter(int nonStaticCounter) {
		this.nonStaticCounter = nonStaticCounter;
		staticCounter++;
		nonStaticCounter++;
		
	}

	public static int getStaticCounter() {
		return staticCounter;
	}

	public static void setStaticCounter(int staticCounter) {
		ObjectCounter.staticCounter = staticCounter;
	}

	public int getNonStaticCounter() {
		return nonStaticCounter;
	}

	public void setNonStaticCounter(int nonStaticCounter) {
		this.nonStaticCounter = nonStaticCounter;
	}

	@Override
	public String toString() {
		return "nonStaticCounter=" 
				+ nonStaticCounter 
				+ "\nStatic Counter=" 
				+ staticCounter;
	}
	
	
	
	
	
	
}
