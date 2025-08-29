package com.nacs.oops.abstraction.main;

import com.nacs.oops.abstraction.AbstractDemo;
import com.nacs.oops.abstraction.impl.SubAbstractDemo;

public class MainSubAbstractionDemo {
	public static void main(String[] args) {
		AbstractDemo demo = new SubAbstractDemo();
		demo.showMessage();
	}
}
