package DSA.Practice;

import org.testng.annotations.Test;

public class RemoveDuplicatesInASortedArray {
	
	
	@Test
	public void testremoveDuplicate()
	{
		System.out.println(removeDuplicates(new int[] {0,0,1,1,2,4}));
		System.out.println(removeDuplicates(new int[] {0,0,1}));
	}
	
	/*
	 * Psuedocode
	 * Intialize a count vaiable count = 0
	 * p1 = 0
	 * p2 = p1+1
	 * using for loop iterte through each values in nums
	 * check if nums[p1] != nums[p2]
	 * if values are unique (p1 = p2)
	 *   - increment p++
	 *   - assign p2 value to p1;
	 * return p1 +1; considering the last element is unique after the pointer value p1.
	 */
	public int removeDuplicates(int[] nums) {
        int p1 = 0;
        for(int p2=1;p2<nums.length;p2++)
        {
        	if(nums[p1]!=nums[p2])
        	{
        		p1++;
        		nums[p1]=nums[p2];
        	}
        }
		return p1+1;
    }
}
