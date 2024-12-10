package DSA.Practice;

import org.testng.annotations.Test;

public class MaxConsecutiveOnesIII_1004 {

	@Test
	public void testLongestOnes()
	{
		System.out.println(longestOnes(new int[] {1,1,1,0,0,0,1,1,1,1,0}, 2));
		
		
		System.out.println(longestOnes(new int[] {0,0,0,0}, 4));
		
		
		System.out.println(longestOnes(new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
	}
	
	
	/*
	 * Psuedocode
	 * have p1 and p2 at index
	 * p2 is fast and p1 slow
	 * count zeros
	 * if zero is greater than k -. move forward the p1 until another zero and decrement zerocount
	 * if zero is less than or equals k, get subarray length and math.max
	 * increment p2 until while condition
	 */
	public int longestOnes(int[] arr, int k) 
	{
		int p1 = 0;
		int p2 = 0;
		int maxLength = 0;
		int maxZeros = 0;
		int arrLength = arr.length;
	
			while(p2<arrLength)
			{
				if(arr[p2]==0)
				{
					maxZeros++;
				}
				while(maxZeros>k)
				{
					if(arr[p1]==0) 
					{
					maxZeros--;
					}
					p1++;
				}
				if(maxZeros<=k)
				{
					int len = p2-p1+1;
					maxLength = Math.max(maxLength, len);
				}
				p2++;
			}
		return maxLength;
	}
}
