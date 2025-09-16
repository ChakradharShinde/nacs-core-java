package com.nacs.java8features.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

import com.nacs.java8features.streamapi.entities.Mobile;

public class MainMobile {
	public static void main(String[] args) {
		Mobile[] mobiles = { 
				new Mobile(1, "Apple", "13s", 70000, 16, "A15 Bionic", "Titaniam", "144hz"),
				new Mobile(1, "Apple", "13s", 70000, 16, "A15 Bionic", "Titaniam", "144hz"),
				new Mobile(2, "Apple", "13s", 70000, 16, "A15 Bionic", "Black", "144hz"),
				new Mobile(3, "Apple", "13s", 70000, 16, "A15 Bionic", "White", "144hz"),
				new Mobile(4, "Samsung", "S20", 50000, 8, "Mediatek", "White", "144hz"),
				new Mobile(5, "Samsung", "S20", 50000, 8, "Mediatek", "Black", "144hz"),
				new Mobile(6, "Samsung", "S20", 50000, 8, "Mediatek", "Blue", "144hz"),
				new Mobile(7, "RedMI", "Note 12", 40000, 16, "Snap Dragon", "Black", "144hz"),
				new Mobile(8, "RedMI", "Note 12", 40000, 16, "Snap Dragon", "White", "144hz"),
				new Mobile(9, "RedMI", "Note 12", 40000, 16, "Snap Dragon", "Red", "144hz"),
				new Mobile(10, "Motorola", "Edge 50", 30000, 8, "Snap Dragon", "Green", "144hz"),
				new Mobile(11, "Motorola", "Edge 50", 30000, 8, "Snap Dragon", "White", "144hz"),
				new Mobile(12, "Motorola", "Edge 50", 30000, 8, "Snap Dragon", "Black", "144hz"), };

//		range price 40000-60000->Snap Dragon
//		Arrays.stream(mobiles)
//		.filter(e->e.getPrice()>=40000 && e.getPrice()<=60000)
//		.filter(e->e.getProcessor().equals("Snap Dragon"))
//		.filter(e->e.getColor().equals("Black"))
//		.forEach(System.out::println);
//		
//		get manufacturer -> unique
//		Arrays.stream(mobiles)
//		.map(e->e.getManufacturer())
//		.distinct()
//		.forEach(System.out::println);

//		get Processor-> unique

//		Arrays.stream(mobiles)
//		.map(Mobile::getProcessor)
//		.distinct()
//		.forEach(System.out::println);

//		motorola->black->price
//		Arrays.stream(mobiles)
//		.filter(e->e.getManufacturer().equals("Motorola"))
//		.filter(e->e.getColor().equals("Black"))
//		.map(e->e.getPrice())
//		.distinct()
//		.forEach(System.out::println);

//		color->unique->sorted->print try with resources
//		try (Stream<Mobile> mobileStream = Arrays.stream(mobiles);) {
//
//			mobileStream.map(Mobile::getColor).distinct().sorted().map(String::toUpperCase)
//					.forEach(System.out::println);
//		}
		
		
		Mobile mobile1 = new Mobile(1, "Apple", "13s", 70000, 16, "A15 Bionic", "Titaniam", "144hz");
		Mobile mobile2 = new Mobile(1, "Apple", "13s", 70000, 16, "A15 Bionic", "Titaniam", "144hz");
		System.out.println(mobile1.hashCode());
		System.out.println(mobile2.hashCode());
		
		
		
		
		try(Stream<Mobile> mobileStream = Arrays.stream(mobiles)){
			mobileStream.filter(e->e.getManufacturer().equals("Apple"))
			.distinct()
			.forEach(System.out::println);
		}
		

	}

}
