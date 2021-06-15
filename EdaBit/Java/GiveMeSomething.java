package com.vikrant.EdabitSolutions;

public class GiveMeSomething {

	public static String giveMeSomething(String stringConcat) {
		String stringToConcatenate = stringConcat;
		String stringSomething = "Something ";
		String result = stringSomething + stringToConcatenate;
		System.out.print("Result: "+result);
		return result;

		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		giveMeSomething("is better than nothing");
	}

}
