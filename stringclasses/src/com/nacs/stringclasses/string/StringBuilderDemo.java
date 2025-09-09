package com.nacs.stringclasses.string;

public class StringBuilderDemo {
	public static void main(String[] args) {
//		String name = "Sa!k $@sh 23i";
//		StringBuilder sB = new StringBuilder();
//		bound object method referencing example
//		Consumer<Character> appendToString = sB::append;

//		arbitary object method referencing example
//		BiConsumer<StringBuilder, Character> appendToString = StringBuilder::append;
//		int j=0;
//		for (int i = 0; i < name.length(); i++)
//			if (Character.isAlphabetic(name.charAt(i))) {
//				if (j % 2 == 0)
//					appendToString.accept(sB, Character.toUpperCase(name.charAt(i)));
//				else
//					appendToString.accept(sB, Character.toLowerCase(name.charAt(i)));
//				j++;
//			}
//		System.out.println(sB.toString());
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Abc");
		stringBuilder.insert(2, " AAA");
		System.out.println(stringBuilder);
		
		System.out.println(stringBuilder.charAt(3));

		System.out.println(stringBuilder.replace(2, 6,"*******"));
		
		stringBuilder.setCharAt(5, '@');
		System.out.println(stringBuilder.reverse());
		
		System.out.println(stringBuilder.length());
		stringBuilder.setLength(5);
		System.out.println(stringBuilder);
		System.out.println(stringBuilder.length());
		
		StringBuilder sb = new StringBuilder();
		sb.append("Ahilya Nagar, Laltaki, NACS");
		
		String result=sb.substring(7,12);
		System.out.println(result);
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("1234567");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		sb1.trimToSize();
		
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		

	}
}
