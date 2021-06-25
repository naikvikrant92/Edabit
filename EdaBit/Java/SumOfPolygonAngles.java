package com.vikrant.EdabitSolutions;

public class SumOfPolygonAngles {
	
	public static int calSumOfPolygonAngles(int angles)
	{
		int anglesCount=angles;
		System.out.printf("Sum of measure of angles of %d sided polygon is:%d", anglesCount, (anglesCount-2)*180);
		return angles;
		
		
	}

	public static void main(String[] args) {
		
		calSumOfPolygonAngles(6);

	}

}
