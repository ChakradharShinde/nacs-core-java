package com.nacs.ioniopackages.inputoutputstream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataInputOutputStreamRecordsDemo {
	public static void main(String[] args) {
//		writing operation
		try(
				Scanner scanner = new Scanner(System.in);
				FileOutputStream fos = new FileOutputStream("records.dat", true);
				DataOutputStream dos = new DataOutputStream(fos);
			){
			System.out.println("Enter No of Records to be Written in a file..");
			int limit=scanner.nextInt();
			for(int i=0;i<limit;i++) {
				System.out.println("Record Number: "  + (i+1));
				System.out.print("Enter Roll No: ");
				dos.writeInt(scanner.nextInt());
				System.out.println();
				System.out.print("Enter Name: ");
				dos.writeUTF(scanner.next());
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
//		read operation
//		try(
//				FileInputStream fis = new FileInputStream("records.dat");
//				DataInputStream dis = new DataInputStream(fis);
//			){
////			for(int i=0;i<2;i++) {
////				System.out.println(dis.readInt());
////				System.out.println(dis.readUTF());	
////			}
//			
//			while(true) {
//				System.out.println(dis.readInt());
//				System.out.println(dis.readUTF());
//			}
//				
//		}catch(EOFException e) {
//			System.out.println("End Of File..");
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		
	}
}
