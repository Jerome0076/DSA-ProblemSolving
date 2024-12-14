package DSA.Practice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SquaresOfASortedArray_977 {

	
	@Test
	public void testSquaresOfSortedArray()
	{
		System.out.println(Arrays.toString(sortedSquares_1(new int[] {-4,-1,0,3,10})));
		
		System.out.println(Arrays.toString(sortedSquares(new int[] {-4,-1,0,3,10})));
	}
	
	/*
	 * Brute Force
	 */
	public int[] sortedSquares(int[] nums) {
		for(int i = 0; i<nums.length; i++)
		{
			nums[i] = nums[i] * nums[i];
		}
		Arrays.sort(nums);
		return nums;
	}
	
	public int[] sortedSquares_1(int[] nums)
	{
		int p1 = 0;
		int p2 = nums.length-1;
		int[] result =  new int[nums.length];
		int index = nums.length-1;
		
		while(p1<=p2)
		{
			int p1_square = nums[p1] * nums[p1];
			int p2_square = nums[p2] * nums[p2];
			if(p1_square > p2_square)
			{
				result[index] = p1_square;
				p1++;
			}
			else
			{
				result[index] = p2_square;
				p2--;
			}
			index--;
		}
		return result;
	}
}
