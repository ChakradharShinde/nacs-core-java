package com.nacs.collection.list;

import java.util.Scanner;

import com.nacs.collection.list.entities.BrowserHistory;

public class App {
	public static void main(String[] args) {
		BrowserHistoryUtil util = new BrowserHistoryUtil();
		try(
				Scanner scanner = new Scanner(System.in);
			){
			int choice=0;
			do {
				System.out.println("1. Visit Website");
				System.out.println("2. Visit Previous Website");
				System.out.println("3. Visit Next Website");
				System.out.println("0. Exit");
				choice=scanner.nextInt();
				switch(choice) {
					case 1->{	
								System.out.println("Enter website");	
								System.out.println("Enter username");
								System.out.println("Enter password");
								util.visitSite(
									new BrowserHistory(
											scanner.next(), 
											scanner.next(), 
											scanner.next())
								);
							}
					
					case 2-> util.previousSite();
					case 3-> util.nextSite();
					case 0-> System.out.println("Bye..");
					default-> System.out.println("Invalid Input..");
				}
			}while(choice!=0);
		}
	}
}
