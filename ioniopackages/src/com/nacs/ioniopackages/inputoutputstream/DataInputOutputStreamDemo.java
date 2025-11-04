package com.nacs.ioniopackages.inputoutputstream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputOutputStreamDemo {
	public static void main(String[] args) {
//		write Operation
//		try(
//				FileOutputStream fos = new FileOutputStream("primitive.dat");
//				DataOutputStream dos = new DataOutputStream(fos);
//			){
//			
//			dos.writeInt(100);
//			dos.writeFloat(100.20F);
//			dos.writeUTF("Student1");
//			
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		
//		Read Operation
		try(
				FileInputStream fis = new FileInputStream("primitive.dat");
				DataInputStream dis = new DataInputStream(fis);
			){
			int intResult=dis.readInt();
			float floatResult=dis.readFloat();
			String stringResult=dis.readUTF();
			System.out.println(intResult);
			System.out.println(floatResult);
			System.out.println(stringResult);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
