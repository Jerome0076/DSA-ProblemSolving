package DSA.Practice;

import org.testng.annotations.Test;

public class SearchInRotatedSortedArray_33 {

	@Test
	public void testSearch()
	{
		System.out.println(search(new int[] {4,5,6,7,0,1,2}, 0));
		
		System.out.println(search(new int[] {4,5,6,7,0,1,2}, 3));
		
		System.out.println(search(new int[] {1}, 0));
	}
	
	public int search(int[] nums, int target)
	{
		int low = 0;
		int high = nums.length-1;		
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(nums[mid]==target)
			{
				return mid;
			}
			else if(nums[mid] >= nums[low])
			{
				if(nums[low]<=target && target<=nums[mid])
				{
					high = mid-1;
				}
				else
				{
					low = mid+1;
				}
			}
			else if(nums[mid] <= nums[high])
			{
				if(nums[mid]<=target && target<=nums[high])
				{
					low = mid+1;
				}
				else
				{
					high = mid-1;
				}
			}
		}		
		return -1;		
	}	
}
