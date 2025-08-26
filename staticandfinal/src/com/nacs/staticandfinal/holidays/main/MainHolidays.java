package com.nacs.staticandfinal.holidays.main;

import com.nacs.staticandfinal.holidays.Holidays;

public class MainHolidays {
	public static void main(String[] args) {
		Holidays independenceDay = new Holidays(1, "Independence Day", "15-08-1947", true, false);
		Holidays republicDay = new Holidays(2, "Republic Day", "26-01-1950", true, false);
		
		System.out.println(independenceDay);
		System.out.println(republicDay);
	}
}
