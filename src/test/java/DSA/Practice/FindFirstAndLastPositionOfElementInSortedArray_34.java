package DSA.Practice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class FindFirstAndLastPositionOfElementInSortedArray_34 {

	@Test
	public void testFindPositions()
	{
		System.out.println(Arrays.toString(searchRange(new int[] {5,7,7,8,8,10}, 8)));
		
		System.out.println(Arrays.toString(searchRange(new int[] {1}, 0)));
		
		System.out.println(Arrays.toString(searchRange(new int[] {1,3}, 1)));
		
		System.out.println(Arrays.toString(searchRange(new int[] {2,2}, 2)));
		
		System.out.println(Arrays.toString(searchRange(new int[] {1,2,2}, 2)));
	}
	
	public int[] searchRange(int[] nums, int target) {
        //Binary Search
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        int n = nums.length;
        int start = -1, end = -1;
        
        //Edge
        if(nums.length == 0) return new int[]{-1, -1};
        if(n == 1)
        {
        	if(nums[0] == target) return new int[] {0,0};
        	else return new int[]{-1, -1};
        }
        if(n == 2)
        {
            if(nums[low]==target && nums[high] == target) return new int[] {0,1};
        }
        if(nums[high]==target && nums[high-1]==target) return new int[] {n-2,n-1};
        
        //First Position
        while(low<=high)
        {
        	mid = (low+high)/2;
        	if(nums[mid] == target)
        	{
        		start = mid;
        		high = mid -1;
        	}
        	else if (nums[mid] == target && nums[mid-1]==target)
        	{
        		return new int[] {mid-1, mid};
        	}
        	
        	if(nums[mid]<target)
        	{
        		low = mid + 1;
        	}
        	else
        	{
        		high = mid -1;
        	}
        }
		
        if (start == -1) return new int[]{-1, -1}; // If no occurrence is found
        
		//Second Position
        low = start;
        high = nums.length-1;
        while(low<=high)
        {
        	mid = (low+high)/2;
        	if(nums[mid] == target)
        	{
        		end = mid;
        		low = mid + 1;
        	}
        	else if (nums[mid] == target)
        	{
        		return new int[] {mid-1, mid};
        	}
        	
        	if(nums[mid]<target)
        	{
        		low = mid + 1;
        	}
        	else
        	{
        		high = mid -1;
        	}
        }
        
        return new int[]{start, end};
    }
	
}
