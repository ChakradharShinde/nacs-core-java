package com.nacs.exceptions.resources;

public class Resource2 implements AutoCloseable{
	public void working() {
		System.out.println("Resource2 is working..");
	}
	
	@Override
	public void close() throws Exception{
		System.out.println("Resource2 is closed.");
	}
}
