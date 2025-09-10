package com.nacs.exceptions.customexecptions;

public class UnderAgedException extends Exception{

	public UnderAgedException() {
		super();
	}

	public UnderAgedException(String message, Throwable cause) {
		super(message, cause);
	}

	public UnderAgedException(String message) {
		super(message);
	}

	public UnderAgedException(Throwable cause) {
		super(cause);
	}
	
}
