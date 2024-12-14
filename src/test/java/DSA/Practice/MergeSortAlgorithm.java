package DSA.Practice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MergeSortAlgorithm {

	
	public static int[] mergeSort(int[] nums){
	    helper(nums, 0, nums.length-1); // first recusrive call
	    return nums;
	}

	public static void helper(int[] nums, int low, int high){

	    // base case - when to stop recursion
	    if(low>=high) return;
	    // find mid point
	    int mid= (low+high)/2;
	    // recurrence relations - smaller sub problem
	    helper(nums,0, mid);
	    // recurrence relations - smaller sub problem
	    helper(nums, mid+1, high);
	    merge(nums, low, mid, high); // post recursion
	}

	// low, mid
	// mid+, high

	public static void merge(int[] nums, int low, int mid, int high){
	    // initialise two pointers
	    // take the left part of array
	    // take right part of array
	    int p1=0, p2=0, index=low;
	    int[] left = Arrays.copyOfRange(nums, low, mid + 1);
	    int[] right= Arrays.copyOfRange(nums, mid+1, high+1);
	    
	    while (p1<left.length && p2<right.length){
	        if(left[p1]<=right[p2]){
	            nums[index++]= left[p1++];
	        }else
	            nums[index++]=right[p2++];
	    }
	    while (p1<left.length){
	        nums[index++]=left[p1++];
	    }
	    while (p2<right.length){
	        nums[index++]=right[p2++];
	    }
	}
	
	@Test
	public static void testMerge()
	{
		System.out.println(Arrays.toString(mergeSort(new int[] {5,3,1,4,2})));
	}
}
