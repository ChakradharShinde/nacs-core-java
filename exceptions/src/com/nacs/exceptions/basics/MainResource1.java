package com.nacs.exceptions.basics;

import com.nacs.exceptions.resources.Resource1;
import com.nacs.exceptions.resources.Resource2;

public class MainResource1 {
	public static void main(String[] args) {
		try(
				Resource1 resource1 = new Resource1();
				Resource2 resource2 = new Resource2();
			){
			
			resource1.working();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
