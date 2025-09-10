package com.nacs.exceptions.basics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResources {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(
				Scanner scanner = new Scanner(System.in);
				FileReader reader = new FileReader("ABC");
				){
			
		}
	}
}
