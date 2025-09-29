package com.nacs.collection.list;

import java.util.Scanner;

import com.nacs.collection.list.entities.Song;

public class MusicPlayerUtil {
	SongList songs = new SongList();
	Operation operation = new Operation();
	
	public void start(Scanner scanner) {
		int choice = 0;
		do {
			System.out.println("1. Play List");
			System.out.println("2. Player");
			System.out.println("3. Previous || Next");
			System.out.println("4. Exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1 -> playList(scanner);
			case 2 -> player(scanner);
			case 3 -> operations(scanner);
			case 0 -> System.out.println("Bye..");
			default -> System.out.println("Invalid Input..");
			}
		} while (choice != 0);
	}

	private void playList(Scanner scanner) {
		int choice = 0;
		do {
			System.out.println("1. Add Song");
			System.out.println("2. Add Song at Index.");
			System.out.println("3. Remove Song");
			System.out.println("0. exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1 -> {
				Song song = getSong(scanner);
				System.out.println(songs.addSong(song));
			}

			case 2 -> {
				System.out.println("Enter Index Number: ");
				int index = scanner.nextInt();
//				scanner.nextLine();
				Song song = getSong(scanner);
				System.out.println(songs.addSongAtIndex(index, song));
			}
			case 3 -> {

				Song song = getSong(scanner);
				System.out.println(songs.removeSong(song));
			}

			case 0 -> System.out.println("Bye..");
			default -> System.out.println("Invalid Input..");
			}

		} while (choice != 0);

	}

	private Song getSong(Scanner scanner) {
		scanner.nextLine();
		System.out.println("Enter Title: ");
		String title = scanner.nextLine();
		System.out.println("Enter Album: ");
		String album = scanner.nextLine();
		System.out.println("Enter Singer: ");
		String singer = scanner.nextLine();
		return new Song(title, album, singer);
	}

	private void player(Scanner scanner) {
		MusicPlayer player = new MusicPlayer();
		player.playList.addAll(songs.playList);
		int choice = 0;
		do {
			System.out.println("1. Play Song by Index");
			System.out.println("2. Play Song by Details");
			System.out.println("0. Exit");
			choice = scanner.nextInt();
			switch (choice) {

			case 1 -> {
				System.out.println("Enter Song number..");
				Song song = player.playSongByIndex(scanner.nextInt());
				operation.addSong(song);
				System.out.println("Currently Playing....");
				System.out.println(song);
			}
			case 2 -> {
				Song song = getSong(scanner);
				song = player.playSongByDetails(song);
				operation.addSong(song);
				System.out.println("Currently Playing..");
				System.out.println(song);
			}
			}

		} while (choice != 0);
	}

	private void operations(Scanner scanner) {
		int choice = 0;
		do {
			System.out.println("1. Previous Song");
			System.out.println("0. Exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1 -> {
				Song song = operation.previousSong();
				System.out.println("Currently Playing..");
				System.out.println(song);
			}
			case 0 -> System.out.println("Bye..");
			default -> System.out.println("Inavalid Input..");
			}
		} while (choice != 0);

	}

}
