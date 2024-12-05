package Assesment1;

import org.testng.annotations.Test;

public class DiagonalSum {

	
	@Test
	public void testDiagonalSum()
	{
		diagonalSum(new int[][] {
			{1,1,1,1},  
			{1,1,1,1},
			{1,1,1,1},
			{1,1,1,1}});
	}
	
	/*
	 * Problem 1 DiagonalSum
	 * 
	 * Diagonal1 (0,0) (1,1) (2,2), (3,3)
	 * Diagonal2 (0,4) (1,3) (2,2), (3,1)
	 */
	
	public int diagonalSum(int[][] array)
	{
		int primaryDiagonalSum = 0;
		int secondaryDiagonalSum = 0;
		int arrayLength = array.length;
		for(int i = 0; i<arrayLength; i++) {
			primaryDiagonalSum = primaryDiagonalSum + array[i][i];
			secondaryDiagonalSum = secondaryDiagonalSum + array[i][arrayLength-i-1];
		}
		int totalSum = primaryDiagonalSum+secondaryDiagonalSum;
			System.out.println(primaryDiagonalSum+"+"+secondaryDiagonalSum+" = "+totalSum);
			return totalSum;
		
		
	}
}
