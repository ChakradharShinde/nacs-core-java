package com.nacs.ioniopackages.readerwriter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderWriterDemo {

	public static void main(String[] args) {
		String data="";
		
		try(
				StringWriter sw = new StringWriter();
			){
			sw.write("I am A Java Trainer\n");
			sw.write("From chh. Sambhaji Nagar");
			data=sw.toString();
//			System.out.println(data);
			
			try(StringReader sr = new StringReader(data);
					BufferedReader br = new BufferedReader(sr)
					){
				String result = "";
			while((result=br.readLine())!=null)
				System.out.println(result);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
