package com.vikrant.EdabitSolutions;

public class BasketballPoints {

	public static void calculatePoints(int twoPointers, int threePointers) {
		int twoPointersTotal = twoPointers;
		int threePointersTotal = threePointers;
		int totalPointsScored = 0;

		twoPointersTotal = twoPointers * 2;
		threePointersTotal = threePointersTotal * 3;
		totalPointsScored = twoPointersTotal + threePointersTotal;
		System.out.println("Total Points scored:"+ totalPointsScored);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculatePoints(5,9);
		
	}

}
