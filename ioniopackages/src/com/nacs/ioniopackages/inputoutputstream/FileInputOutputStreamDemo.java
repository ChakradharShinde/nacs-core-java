package com.nacs.ioniopackages.inputoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputOutputStreamDemo {
	
	public static void main(String[] args) {
//		absolute path or relative path
//		String name="ABC";
//		Write Operation
//		try {
//			FileOutputStream fos = new FileOutputStream("demo.txt");
//			// char 16bit 2 byte
//			char ch = '0';
//			fos.write(name.getBytes());
//			fos.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			
//		}
		
		try {
			FileInputStream fis = new FileInputStream("demo.txt");
			
			int result=0;
			while((result=fis.read())!=-1){
				System.out.println((char)result);
				
			}
			System.out.println(result);
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
