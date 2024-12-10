package DSA.Practice;

import org.testng.annotations.Test;

public class FindPeakElement_162 {

	@Test
	public void testPeakElement()
	{
		System.out.println(findPeakElement(new int[] {1,2,3,1}));
	}
	
	/*
	 *  if(n==1) return 0;
		if(nums[0]>nums[1]) return 0;
		if(nums[n-1]> nums[n-2]) return n-1];
		while(low<=high)
		mid= low+high/2
		if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1] return mid;
		if(nums[mid]< nums[mid+1]) --> Low= mid+1
		else --> high = mid-1
	 */
	public int findPeakElement(int[] nums) {
		int low = 1;
		int high = nums.length-2;
		int mid = 0;
		int n = nums.length;
		
		//EdgeCases
		if(n==1) return 0;
		if(nums[0]>nums[1]) return 0;
		if(nums[n-1]> nums[n-2]) return n-1;
		
		//Test
		while(low<=high)
		{
			mid = (low+high)/2;
			if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
			
			if(nums[mid]<nums[mid+1])
			{
				low = mid+1;
			}
			else
			{
				high = mid-1;
			}
		}
		
		
		return mid;
        
    }
}
