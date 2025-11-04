package com.nacs.ioniopackages.readerwriter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) {
		try(
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
			){
			System.out.print("Enter your rollNo: ");
			// "123"
			int rollNo = Integer.parseInt(br.readLine());
			
			System.out.println(rollNo);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
