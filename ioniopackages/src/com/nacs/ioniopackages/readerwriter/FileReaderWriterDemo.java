package com.nacs.ioniopackages.readerwriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		try(
				FileWriter fw = new FileWriter("RWDemo.log");
				BufferedWriter bw = new BufferedWriter(fw);
				FileReader fr = new FileReader("RWDemo.log");
				BufferedReader br = new BufferedReader(fr);
			){
			
			bw.write("Yash is a BCA third year Student");
			bw.newLine();
			bw.write("From Ahilya Nagar, Maharashtra");
//			clean internal buffer
			bw.flush();
			String data="";
			while((data=br.readLine())!=null)
				System.out.println(data);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
