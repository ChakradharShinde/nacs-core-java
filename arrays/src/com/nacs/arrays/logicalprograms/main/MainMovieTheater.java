package com.nacs.arrays.logicalprograms.main;

import com.nacs.arrays.logicalprograms.MovieTheater;

public class MainMovieTheater {
	public static void main(String[] args) {
		MovieTheater theater1 = new MovieTheater();
		String[][] seats=new String[3][];
		String flag="Booked";
		
		seats[0]=new String[] {null, flag, null}; 
		seats[1]=new String[] {flag, flag, null, flag, flag};
		seats[2]=new String[] {null, null, flag, flag, flag, null, null};
		
		theater1.bookTickets(seats);
		
		theater1.bookedSeats();
	}
}
