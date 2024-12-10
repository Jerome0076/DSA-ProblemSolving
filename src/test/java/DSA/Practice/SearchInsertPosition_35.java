package DSA.Practice;

import org.testng.annotations.Test;

public class SearchInsertPosition_35 {

	@Test
	public void testsearch()
	{
		System.out.println(searchIndex(new int[] {1,3,5,6}, 5));
		
		System.out.println(searchIndex(new int[] {1,3,5,6}, 4));
		
		System.out.println(searchIndex(new int[] {1,3,5,6}, 7));
	}
	
	public int searchIndex(int[] nums, int target)
	{
		int low = 0;
		int high = nums.length-1;
		int ans = nums.length;
		while(low <= high)
		{
			int mid = (low + high)/2;
			if(nums[mid]>=target)
			{
				ans = mid;
				high = mid - 1;
			}
			else
			{
				low = mid + 1;
			}
		}
		return ans;
	}
}
