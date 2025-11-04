package com.nacs.multithreading.executorservices;

public class RunnablePrintMessage implements Runnable {
	private PrintMessage printMessage;
	private String data;
	public RunnablePrintMessage(PrintMessage printMessage, String data) {
		this.printMessage = printMessage;
		this.data = data;
	}
	
	@Override
	public void run() {
		printMessage.showMessage(data);
	}
	
}
