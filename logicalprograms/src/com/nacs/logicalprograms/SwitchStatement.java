package com.nacs.logicalprograms;

public class SwitchStatement {
	public static void main(String[] args) {
		String name = "Candidate";
		int aCounter = 0;
		int eCounter = 0;
		int iCounter = 0;
		int oCounter = 0;
		int uCounter = 0;
		int cCounter = 0;
		for (int i = 0; i < name.length(); i++)
			switch (name.charAt(i)) {
			case 'a' -> aCounter++;
			case 'e' -> eCounter++;
			case 'i' -> iCounter++;
			case 'o' -> oCounter++;
			case 'u' -> uCounter++;
			default -> cCounter++;
			}
		System.out.println("A = " + aCounter);
		System.out.println("E = " + eCounter);
		System.out.println("I = " + iCounter);
		System.out.println("O = " + oCounter);
		System.out.println("U = " + uCounter);
		System.out.println("C = " + cCounter);

	}
}
