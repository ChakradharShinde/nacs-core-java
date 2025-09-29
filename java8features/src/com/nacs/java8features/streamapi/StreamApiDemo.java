package com.nacs.java8features.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamApiDemo {
	public static void main(String[] args) {
//		int[] intArray = {3,2,1,5,5,7,9,6,7,8,9};
//		Arrays.stream(intArray)
//		.filter(n->n%2==0)
//		.filter(n->n>=4)
//		.forEach(n->System.out.println(n));
		
//		Arrays.stream(intArray)
//		.map(number->number+1)
//		.sorted()
//		.forEach(n->System.out.println(n));
		
		
//		Arrays.stream(intArray)
//		.distinct()
//		.peek(System.out::println)
//		.skip(2)
//		.limit(3)
//		.forEach(System.out::println);
		
//		Arrays.stream(intArray)
//		.filter(n->n%2!=0)
//		.map(n->n*n)
//		.limit(2)
//		.forEach(System.out::println);
		
//		String[] names= {"Sakshi", "Shraddha", "Babita", "Nayan", 
//						"Pranali", "Sakshi", "Ganesh", "Om", "Vaibhav", "Yash",
//						"Kajal", "Rutuja", "Priyanka", "Surabhi"
//						};
//		
		
//		Arrays.stream(names)
//		.distinct()
//		.map(String::length)
//		.sorted()
//		.limit(5)
//		.forEach(System.out::println);
		
		
//		unique->length even->Upper case->sorted->print
//		Arrays.stream(names)
//		.distinct()
//		.filter(str->str.length()%2==0)
//		.map(String::toUpperCase)
//		.sorted()
//		.forEach(System.out::println);
		
//		try(
//		IntStream intStream = Arrays.stream(new int[] {7,3,1,5,9,2});
//		){
//			int[] result=intStream.map(n->n+1).toArray();
//			System.out.println(Arrays.toString(result));
//			
//		}
		
//		toArray method for String object
//		String[] names= {"Ansh", "Niraj", "Sai", "Tejas", "Soham", "Rohit"};
//		
//		try(Stream<String> nameStream=Arrays.stream(names);){
//			String[] result=nameStream
//			.filter(s->s.charAt(1)=='o')
////			.toArray(l->new String[l]);
//			.toArray(String[]::new);
//			System.out.println(Arrays.toString(result));
//		}
		
		
//		Student[] studentArray = {
//				new Student(1,"ABC"),
//				new Student(2,"ABCD"),
//				new Student(0,"A")
//		};
//		
//		try(Stream<Student> studentStream=Arrays.stream(studentArray);){
//			Optional<Student> student=studentStream
//			.max((s1,s2)->s1.getName().compareTo(s2.getName()));
//			
//			if(student.isPresent())
//				System.out.println(student.get());
//		}
		
		
		

	}
	
	
	
	
	
}
