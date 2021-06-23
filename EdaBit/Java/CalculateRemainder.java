package com.vikrant.EdabitSolutions;

public class CalculateRemainder {
	
	public static int calculateRemainder(int num1,int num2)
	{
		System.out.format("Remainder of %d when divided by %d is:%d" ,num1,num2,num1%num2);
		
		
		return num1%num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculateRemainder(10,6);

	}

}
