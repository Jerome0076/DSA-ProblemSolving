package DSA.Practice;

import org.testng.annotations.Test;

public class FindPivotIndex_724 {
	
	@Test
	public void testfindPivotIndex()
	{
		System.out.println(findPivotIndex(new int[] {1,7,3,6,5,6}));
		System.out.println(findPivotIndex(new int[] {1,2,3}));
		System.out.println(findPivotIndex(new int[] {2,1,-1}));
	}
	
	/*
	 * Pseudocode 
	 * Get total sum of the array
	 * init leftCount = 0 and keep incrementing every iteration
	 * in every iteration check
	 *  right count = totalcount - leftcount - num[i]
	 *  if rightcount = left count
	 *  return i
	 */
	public int findPivotIndex(int[] nums)
	{	
		//PrefixSum to take all sum
		int totalSum = 0;
		for(int num : nums)
		{
			totalSum = totalSum+num;
		}
		System.out.println(totalSum +": Total Sum of the given array");
		
		int leftcount = 0;
		//Right Count = TotalCount - LeftCount
		for(int i = 0; i<nums.length; i++)
		{
			int rightCount = totalSum - leftcount - nums[i];
			if(rightCount == leftcount)
			{
				return i;
			}
			leftcount = leftcount + nums[i];
		}
		return -1;
	}
}
