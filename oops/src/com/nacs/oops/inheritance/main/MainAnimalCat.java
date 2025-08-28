package com.nacs.oops.inheritance.main;

import com.nacs.oops.inheritance.subtype.Cat;

public class MainAnimalCat {
	public static void main(String[] args) {
		Cat cat = new Cat("Very Good",3,"Meow Meow",'F');
		
		System.out.println(cat.getNightVision());
		System.out.println(cat.getAge());
		System.out.println(cat.getSound());
		System.out.println(cat.getGender());
		
		Cat hostelCat = new Cat("Hisssssssssssssss", 'F');
		
		hostelCat.setAge(6);
		
		System.out.println(hostelCat.toString());
		
	}
}
