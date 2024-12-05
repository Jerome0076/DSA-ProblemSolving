package Assesment1;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SortandMergeArray {
	
	@Test
	public void testSortArray()
	{
		sortArrays(new int[] {1,2,3,0,0,0},new int[] {2,5,6}, 3, 3);
		
		sortArrays(new int[] {1},new int[] {}, 1, 0);
		
		sortArrays(new int[] {0},new int[] {1}, 0, 1);
	}
	
	/*
	 * Psuedocode - 3Pointer
	 * init pointers i = m-1, j=n-1, index = m+n-1.
	 * have while(i<=0 and j<=)
	 * 	while(i<=0 && j<=0) 		
			if(nums[i] < nums[j])	
				nums[j]=nums[k]
				k--
				j--
			else	
				nums[i]=nums[k]
				k--
				i--
		Again while to copy in nums2
			while(j>=0)
				nums1[k] = nums2[j]
				j--
				index--		
	 * 
	 * TC O(n+m)
	 * SC O(1)
	 */
	public void sortArrays(int[] nums1, int[] nums2, int m, int n)
	{
		int i = m-1, j=n-1, index=m+n-1; // SC O(1)
		while(i>=0 && j >=0) //O(n)
		{
			if(nums1[i] < nums2[j])
			{
				nums1[index] = nums2[j];
				j--;
				index--;
			}
			else
			{
				nums1[index] = nums1[i];
				i--;
				index--;
			}
		}
		while(j>=0) //O(m)
		{
			nums1[index] = nums2[j];
			j--;
			index--;
		}
		System.out.println(Arrays.toString(nums1));
	}
}
