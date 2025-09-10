package com.nacs.miniproject2.exceptions;

public class InvalidNameException extends Exception{

	public InvalidNameException() {
		super();
	}

	public InvalidNameException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidNameException(String message) {
		super(message);
	}

	public InvalidNameException(Throwable cause) {
		super(cause);
	}

	
}
