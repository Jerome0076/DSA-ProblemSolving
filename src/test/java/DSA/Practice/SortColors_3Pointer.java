package DSA.Practice;

import org.testng.annotations.Test;

public class SortColors_3Pointer {
	
	@Test
	public void testSortColors()
	{
		sortColors(new int[] {2,0,2,1,1,0});
	}

	    /*
	     *left=0, right=nums.length-1, mid=0; (mid, fast pointer, left, right= slow pointer)
	         - if(nums[mid]==0){
	         // code
	         swap left, mid
	         increment both mid, left
	         }else if(nums[mid]==1){
	         //mid++
	         }
	         else{
	         // swap mid and right
	         // decremt right
	         }
	     *
	     */  
	 public void sortColors(int[] nums) {
	     int left = 0;
	     int mid = 0;
	     int right = nums.length-1;
	     while(mid<=right)
	     {
	         if(nums[mid] == 0)
	         {
	             int temp = nums[mid];
	             nums[mid] = nums[left];
	             nums[left] = temp;
	             left++;
	             mid++;
	         }
	         else if (nums[mid]==1)
	         {
	             mid++;
	         }
	         else
	         {
	             int temp = nums[mid];
	             nums[mid] = nums[right];
	             nums[right] = temp;
	             right--;
	         }
	
	     }
	
	 }
}

