package DSA.Practice;

import java.util.HashMap;

import org.testng.annotations.Test;

public class SubArraySumEqualsToK_560 {
	
	@Test
	public void testSubArraySumEqualstoK()
	{
		System.out.println(subArraySumEqualsToK(new int[] {1,2,3,-3,1,1,1,4,2,-3}, 3));
		System.out.println(optimized_subArraySumEqualsToK(new int[] {1,2,3,-3,1,1,1,4,2,-3}, 3));
	}
	
	/*
	 * Psuedocode - Brute Force Approach
	 * TC -> O(n^3) SC -> O(n)
	 * Init variable count = 0
	 * Init 2 nested for loops to identify the Sub Arrays
	 * Have a separate nested for loop to iterate and sum the range of i and j
	 * Have condition to check if sum == k and increment count
	 * 
	 */
	public int subArraySumEqualsToK(int[] nums, int k)
	{
		int count = 0;
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0; j<nums.length;j++)
			{
				int sum = 0;
				for(int k1=i; k1<=j; k1++)
				{
					sum = sum + nums[k1];
				}
				if(sum == k)
				count++;
			}
		}
		
		return count;
	}
	
	/*
	 * https://www.youtube.com/watch?v=xvNwoz-ufXA
	 * {1,2,3,-3,1,1,1,4,2,-3}
	 */
	public int optimized_subArraySumEqualsToK(int[] nums, int k)
	{
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		int count = 0;
		int prefixSum = 0;
		hashMap.put(0, 1);
		for(int i=0; i<nums.length; i++)
		{
			prefixSum = prefixSum + nums[i];
			int remaining = prefixSum - k;
			if(hashMap.containsKey(remaining))
			{
				count = count + hashMap.get(remaining);				
			}
			hashMap.put(prefixSum, hashMap.getOrDefault(prefixSum, 0)+1);
		}
		return count;
		
	}
}
