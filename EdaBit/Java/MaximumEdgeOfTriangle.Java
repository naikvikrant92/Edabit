package com.vikrant.EdabitSolutions;

public class MaximumEdgeOfTriangle {
	
	public static int maxThirdSideRange(int firstSide,int secondSide)
	{
		int firstSideEdge=firstSide;
		int secondSideEdge=secondSide;
		int thirdSideRange=0;
		thirdSideRange=(firstSide+secondSide)-1;
		System.out.println("Maximum third side range is:"+thirdSideRange);
		return thirdSideRange;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 maxThirdSideRange(8,10);

	}

}
