package DSA.Practice;

import org.testng.annotations.Test;

public class RemoveElement {
	
	@Test
	public void testRemoveElement()
	{
		System.out.println(removeElement(new int[] {1,3,3,4}, 3));
		System.out.println(removeElement(new int[] {0,1,2,2,3,0,4,2}, 2));
	}

	/*
	 * LeetCode 27 - Remove Element
	 * Psuedocode
	 * -Declare two pointers 
	 */
	  public static int removeElement(int[] nums, int val) {
	        int index = 0;
	        int arrayCount = nums.length;
	        for(int i = 0; i < arrayCount; i++)
	        {
	            if(nums[i] != val)
	            {
                  nums[index] = nums[i];
                  index++;
	            }
	        }
			return index;
	    }
	
}
