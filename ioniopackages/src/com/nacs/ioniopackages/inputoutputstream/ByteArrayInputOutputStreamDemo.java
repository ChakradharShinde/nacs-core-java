package com.nacs.ioniopackages.inputoutputstream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.nacs.ioniopackages.inputoutputstream.entities.Employee;

public class ByteArrayInputOutputStreamDemo {
	public static void main(String[] args) {
		Employee employee = new Employee(1,"Jay",30000F);
		
		try(
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(baos);
				
				
			){
			
//			object write to ByteArrayOutputStream
//			Serialization
			oos.writeObject(employee);
			System.out.println("Operation completed successfully..");
			
			byte[] result = baos.toByteArray();
			
			try(
					ByteArrayInputStream bais = new ByteArrayInputStream(result);
					ObjectInputStream ois = new ObjectInputStream(bais);
				){
				
				Employee resultEmployee = (Employee)ois.readObject();
				System.out.println(resultEmployee);
			} 
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
