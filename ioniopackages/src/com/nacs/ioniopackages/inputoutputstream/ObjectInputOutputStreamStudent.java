package com.nacs.ioniopackages.inputoutputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.nacs.ioniopackages.inputoutputstream.entities.Student;

public class ObjectInputOutputStreamStudent {
	public static void main(String[] args) {
		Student student1 = new Student(1,"Babita");
//		write Operation
//		try(
//				FileOutputStream fos = new FileOutputStream("student.rec");
//				ObjectOutputStream oos = new ObjectOutputStream(fos);
//			){
////			java obj -> byte (Serialization)
//			oos.writeObject(student1);
//			
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		
//		read operation
		try(
				FileInputStream fis = new FileInputStream("student.rec");
				ObjectInputStream ois = new ObjectInputStream(fis);
			){
//			byte -> java obj (deserialization)
			Student result= (Student)ois.readObject();
			System.out.println(result);
			
		}catch(IOException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
