package com.vikrant.EdabitSolutions;

public class AgeToDays {

	
	public static int convertAgeToDays(int years)
	{

		int yearsEntered=years;
		
		System.out.printf("Age %d converted in days is equal to:%d",yearsEntered,yearsEntered*365);
		
		return yearsEntered*365;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convertAgeToDays(65);

	}

}
