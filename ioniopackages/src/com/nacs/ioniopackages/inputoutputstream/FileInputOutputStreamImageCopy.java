package com.nacs.ioniopackages.inputoutputstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamImageCopy {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("D:\\NACS\\image\\image1.png");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("D:\\NACS\\image\\image4.png");
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {
			
			byte[] buffer = new byte[1024];
			int noOfBytes = 0;
			while ((noOfBytes = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, noOfBytes);
			}
			System.out.println("Image copied Successfully...");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
