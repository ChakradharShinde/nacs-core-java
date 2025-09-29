package com.nacs.collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SotedSetDemo {
	public static void main(String[] args) {
		SortedSet<String> sortedNames = new TreeSet<>();

		sortedNames.add("Shruti");
		sortedNames.add("Sakshi");
		sortedNames.add("Pranali");
		sortedNames.add("Babita");
		sortedNames.add("Shraddha");
		sortedNames.add("Yash");

		System.out.println(sortedNames);

		SortedSet<String> headSet = sortedNames.headSet("I");

		System.out.println(headSet);	

		SortedSet<String> subSet = sortedNames.subSet("I", "R");

		System.out.println(subSet);

//		[ is a character after Z
		SortedSet<String> tailSet = sortedNames.tailSet("R");

		System.out.println(tailSet);

	}
}
