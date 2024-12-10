package DSA.Practice;

import org.testng.annotations.Test;

public class SingleElementInASortedArray_540 {

	@Test
	public void test()
	{
		System.out.println(singleNonDuplicate(new int[] {1,1,2,3,3,4,4,8,8}));
		
		System.out.println(singleNonDuplicate(new int[] {1}));
	}
	
	/*
	 * If the array has one element, return it as the single non-duplicate.
	Check the first and last elements: if they are not equal to their neighbors, return the corresponding element.
	Set low to 1 and high to n - 2 (search space excluding the first and last elements).
	Binary search: While low <= high, find the middle element mid. If mid is not equal to its neighbors, return it.
	Adjust search bounds based on whether mid is even or odd, and whether the value matches its neighbors. Repeat until the result is found.
	 */
	public int singleNonDuplicate(int[] nums) {
		int n=nums.length;
		int low=1;
	    int high=n-2;
	    int mid=0;
		
		if(n==1) return nums[0];
		if(nums[0]!=nums[1]) return nums[0];
		if(nums[n-1]!= nums[n-2]) return nums[n-1];
		
		while(low<=high)
		{
			mid=(low+high)/2;
			if(nums[mid]!=nums[mid-1] &&nums[mid]!=nums[mid+1]) return nums[mid];
			
			if(mid%2==0 )
				if(nums[mid]==nums[mid+1])
					low=mid+1;
				else high=mid-1;
			if(mid%2==1)
				if(nums[mid]==nums[mid-1])
					low=mid+1;
				else high=mid-1;
		}
		return nums[mid];
	}
}
