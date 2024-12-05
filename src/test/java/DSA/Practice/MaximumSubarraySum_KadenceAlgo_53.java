package DSA.Practice;

import org.testng.annotations.Test;

public class MaximumSubarraySum_KadenceAlgo_53 { 
	
	@Test
	public void testKadenceAlgo()
	{
		System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
		
		System.out.println(maxSubArray(new int[] {1}));
		
		System.out.println(maxSubArray(new int[] {5,4,-1,7,8}));
	}

	 public int maxSubArray(int[] nums) {
		 
		 int currSum = nums[0];
		 int maxSum = nums[0];
		 
		 for(int i=1; i<nums.length; i++)
		 {
			 //To find running sum
			 currSum = currSum+nums[i];
			 currSum = Math.max(currSum, nums[i]);
			 maxSum = Math.max(currSum, maxSum);
		 }
		 return maxSum;
        
}
}
