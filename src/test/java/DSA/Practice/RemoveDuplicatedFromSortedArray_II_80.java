package DSA.Practice;

import org.testng.annotations.Test;

public class RemoveDuplicatedFromSortedArray_II_80 {
	
	@Test
	public void testRemoveDuplicatesinSortedArray()
	{
		System.out.println(removeDuplicates(new int[] {1,1,1,2,2,3}));
		System.out.println(removeDuplicates(new int[] {0,0,1,1,1,1,2,3,3}));
	}
	
	public int removeDuplicates(int[] nums) {
	       /*
	       * Pseudocode
	       * Init the starting index pointer 0,
	          Iterate j using a for loop and check \
	            if nums[i] != nums[j] // to stop j at unique indexes
	            and increment i++
	            Assign nums[i] = nums[j]
	            return i+1
	       *
	       */
	        int i = 2;
	        for(int j=2; j<nums.length; j++)
	        {
	            if(nums[i-2] != nums[j])
	            {
	                nums[i] = nums[j];
	                i++;
	            }
	        }
	        return i;
	    }
	
}
