package com.nacs.multithreading.executorservices;

import java.util.concurrent.Callable;

public class CallablePrintTableImpl implements Callable<Integer>{

	@Override
	public Integer call() {
		return (int)(Math.random()*10);
	}
}
