package DSA.Practice;

import org.testng.annotations.Test;

public class MaxSumSubarrayOfSizeK {
	
	@Test
	public void testMaxSubarrraySum()
	{
		System.out.println(maximumSumSubarray(new int[] {100,200,300,400}, 2));
		
		System.out.println(maximumSumSubarray(new int[] {100,200,300,400}, 4));
		
		System.out.println(maximumSumSubarray(new int[] {100,200,300,400}, 1));
		
		System.out.println(maximumSumSubarray(new int[] {1,5,4,3,2,9,9,9}, 3));
	}
	
	public int maximumSumSubarray(int[] arr, int k) {
        int currSum = 0, maxSum = 0;
        for(int i = 0; i<k; i++)
        {
        	currSum=currSum+arr[i];
        }
		maxSum=currSum;
		
		//SlidingWindow
		for(int i=k; i<arr.length; i++)
		{
			currSum=currSum+arr[i];
			currSum=currSum-arr[i-k];
		}
		return maxSum = Math.max(currSum, maxSum);
    }

}
