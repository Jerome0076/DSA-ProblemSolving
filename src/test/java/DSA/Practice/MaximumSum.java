package DSA.Practice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MaximumSum {

	@Test
	public void testMaximumSum()
	{
		System.out.println(findMaximumSum(new int[] {34,23,1,24,75,33,54,8}, 60));
		
		System.out.println(findMaximumSum_2Pointer(new int[] {34,23,1,24,75,33,54,8}, 60));
	}
	
	/*
	 * 
	 * Pseudocode - BruteForce
	 * Init a MaxSum = Integer.MinValue
	 * Using 2 For Loops
	 * 	-Iterate 0 -> nums.length
	 * 		sum = nums[i] + nums[j]
	 * 		if (sum > maxSum )
	 * 			maxSum = sum;
	 * 
	 * 
	 * TC - O(n)
	 * SC - O(1)
	 */
	public int findMaximumSum(int[] nums, int k)
	{
		Arrays.sort(nums);
		int maxSum = Integer.MIN_VALUE;
		for(int i=0; i<nums.length; i++)
		{
			for(int j=i+1; j<nums.length; j++)
			{
				int currentSum = nums[i] + nums[j];
				if(currentSum>maxSum && currentSum<=k)
				{					
					maxSum = currentSum;
					System.out.println(nums[i]+", "+nums[j]+" = "+currentSum);
				}
				
			}
		}
		return maxSum;
	}
	
	/*
	 * Pseudocode Maximum Sum 2 Pointer
	 * Init Pointers
	 * p1 = 0 , P2 = nums.length
	 * maxSum = Integer.MinValue
	 * Sort the Array
	 * Init current sum = nums[p1] + nums[p2]
	 * 		while(p1<p2)
	 *			if(currentSum<=k)
	 *				maxSum = currentSum;
	 *				p2--
	 *			else
	 *				p1++
	 * 
	 */
	public int findMaximumSum_2Pointer(int[] nums, int k)
	{
		Arrays.sort(nums);
		int p1 = 0, p2 = nums.length-1;
		int maxSum = Integer.MIN_VALUE;
		while(p1<p2)
		{
			int currentSum = nums[p1] + nums [p2];
			if(currentSum<=k)
			{
				maxSum = currentSum;
				p1++;
			}
			else
			{
				p2--;
			}
		}
		return maxSum;
	}
	
}
