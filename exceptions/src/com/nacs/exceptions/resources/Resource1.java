package com.nacs.exceptions.resources;

public class Resource1 implements AutoCloseable{

	public void working() {
		System.out.println("Resouce1 is working...");
	}
	
	@Override
	public void close() {
		System.out.println("Resource1 i closed...");
	}
	
}
