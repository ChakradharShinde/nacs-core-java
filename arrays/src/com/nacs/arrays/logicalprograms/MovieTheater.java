package com.nacs.arrays.logicalprograms;

public class MovieTheater {
	private String[][] seats;

	public MovieTheater() {
	}

	public MovieTheater(String[]... seats) {
		this.seats = seats;
	}

	public void bookTickets(String[]... seats) {
		this.seats = seats;
	}

	public void bookedSeats() {
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++)
				System.out.print(" " + ((seats[i][j]==null)?"*":"B") + " ");
			System.out.println();
		}
	}

}
