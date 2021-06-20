package com.vikrant.EdabitSolutions;

public class HoursToSeconds {

	public static int HoursToSeconds(int hours) {
		int hoursToConvert = hours;
		int seconds = hoursToConvert * 60 * 60;
		System.out.format("%d hours converted to %d seconds",hoursToConvert,seconds);

		return seconds;
	}

	public static void main(String[] args) {
		
		HoursToSeconds(5);

	}

}
