package com.nacs.multithreading.executorservices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainRunnablePrintMessage {
	public static void main(String[] args) {
		PrintMessage printMessage = new PrintMessage();
		String[] names = { "Babita", "Yash", "Sakshi", "Priyanka", "Jay" };
		ExecutorService services = Executors.newCachedThreadPool();

		for (int i = 0; i < names.length; i++)
			services.execute(new RunnablePrintMessage(printMessage, names[i]));
		services.shutdown();
	}
}
