package DSA.Practice;

import org.testng.annotations.Test;

public class RotateArray_189 {

	@Test
	public void testRotateArray()
	{
		rotateArray(new int[] {1,2,3,4,5,6,7}, 3);
	}
	
	
	
	public void rotateArray(int[] nums, int k)
	{
		int arrLength = nums.length;
		k = k % arrLength;
		
		if(k < 0)
		{
			k = k + arrLength;
		}
		 reverse(nums, 0, arrLength-k-1);
		 reverse(nums, arrLength-k, arrLength-1);
		 reverse(nums, 0, arrLength-1);
	}
	
	public void reverse(int[] nums, int i, int j)
	{
		while(i < j)
		{
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
		}
	}
}
