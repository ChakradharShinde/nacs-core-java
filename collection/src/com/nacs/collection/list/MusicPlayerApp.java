package com.nacs.collection.list;

import java.util.Scanner;

public class MusicPlayerApp {
	public static void main(String[] args) {
		MusicPlayerUtil util = new MusicPlayerUtil();
		try(
				Scanner scanner = new Scanner(System.in);
			){
			util.start(scanner);
		}
	}
}
