package com.nacs.stringclasses.string;

import java.util.Arrays;

public class StringDemo {
	public static void main(String[] args) {
		String name = new String("ABC");
		String name1 = "Sakshi";
		String name2 = "Rohit";
		
//		for(int i=0;i<10;i++)
//			name1 = "ABC" + i;
		
		
//		System.out.println(name2==name1);
		
//		System.out.println(name2.compareToIgnoreCase(name1));
//		
//		
//		System.out.println(name1.concat(" Kale"));
//		
		System.out.println(name1.contains("akas"));
		
		
		System.out.println(name2.endsWith("het"));
		
		String name3 = new String("Pranali");
		
		String name4 = "Pranali";
		
		System.out.println(name4.intern()==name4);
		
		
		String[] names = {"Pranali", "Sakshi", "Rohit", "Jadoo"};
		
		String name7=String.join(", ", names);
		System.out.println(name7);
		
		String name8=" Ommmmmmmmmmmmmm";
		
//		if(name8.matches("[A-Z][a-z]{1,14}"))
//			System.out.println("Valid name");
//		else
//			System.out.println("invalid name");
		
		String address = "Ahilya Nagar, Laltaki, NACS";
		String[] addresses=address.split(",");
		for(String data:addresses)
			System.out.println(data.trim());
		
//		System.out.println(address.startsWith("A"));
		String name9="Kajal";
		char[] nameCharArray=name9.toCharArray();
		System.out.println(Arrays.toString(nameCharArray));
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
