package com.nacs.java8features.functionalinterfaces;

import java.util.function.Function;

public class MainFunctionalInterfaces {
	public static void main(String[] args) {
//		Predicate<String> predicate = str -> str.length()%2==0;
//		
//		if(predicate.test("Shruti"))
//			System.out.println("Shruti name contains Even number of Character");
//		else
//			System.out.println("Shruti name contains Odd number of Character");
//		
//		
//		
//		Predicate<String> containsVowels = str -> {
//			char temp='0';
//			for(int i=0;i<str.length();i++) {
//				temp=str.toLowerCase().charAt(i);
//				if(temp=='a' || temp== 'e' || temp=='i' || temp == 'o' || temp =='u')
//					return true;
//				
//			}
//			return false;
//		};
//		
//		if(containsVowels.test("Rhythym"))
//			System.out.println("Rhythym name contains Vowels");
//		else
//			System.out.println("Rhythym name does not contains Vowels");

//		Consumer<String> consumer = str -> System.out.println(str); 
//		
//		consumer.accept("Sakshi");

//		int[] intArray = { 1, 2, 3, 4, 5, 6, 7 };
//		
//		Consumer<Integer> printInt = number -> System.out.println(number*number);
//		
//		for(int i=0;i<intArray.length;i++)
//			printInt.accept(intArray[i]);
//		
//		String name="Shraddha";
//		
//		Consumer<Character> printChar = ch -> System.out.println(ch);
//		
//		for(char ch:name.toCharArray())
//			printChar.accept(ch);

//		Function<Integer, Float> areaOfCircle = radius->radius*radius*3.14F;
//		
//		System.out.println(areaOfCircle.apply(10));
//		
//		Function<String, Integer> strLength= str -> str.length();
//		
//		System.out.println(strLength.apply("NACS"));

//		Supplier<Double> randomNumber = () -> Math.random()*10;
//		Supplier<Integer> randomNumber = () -> (int) ((Math.random() * 60) % 6);
//		Scanner scanner = new Scanner(System.in);
//		int choice = 0;
//		do {
//			System.out.println("1.continue or O.exit");
//			choice = scanner.nextInt();
//			switch (choice) {
//			case 1:
//				System.out.println(randomNumber.get() + 1);
//				break;
//			case 0:
//				System.out.println("Bye...");
//				break;
//			default:
//				System.out.println("Try Again...");
//				break;
//			}
//		} while (choice != 0);
//
//		scanner.close();
		
		
//		BinaryOperator<Integer> addition = (number1, number2)-> number1+number2;
//		System.out.println(addition.apply(10, 20));
		
//		Consumer<Integer> doubleNumber = number -> System.out.println(number*2);
//		
//		Consumer<Integer> squareNumber = number -> System.out.println(number*number);
//		
//		Consumer<Integer> doubleAndSquare = squareNumber.andThen(doubleNumber);
//		
//		doubleAndSquare.accept(4);
//		
		
//		Function<Integer, Integer> doubleNumber = number -> number*2;
//		Function<Integer, Integer> squareNumber = number -> number*number;
//		Function<Integer, Integer> squareAndDouble = doubleNumber.andThen(squareNumber);
//		Function<Integer, Integer> squareAndDouble1 = doubleNumber.compose(squareNumber);
//		System.out.println(squareAndDouble.apply(4));
//		System.out.println(squareAndDouble1.apply(4));
//		
//		Function<Object, Object> obj=Function.identity();
//		System.out.println(obj.apply("Shraddha"));

	}
	
	
	
	
	
	
	
	

}
