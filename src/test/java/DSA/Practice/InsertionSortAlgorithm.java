package DSA.Practice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class InsertionSortAlgorithm {

	
	@Test
	public void testInsertionSort()
	{
		System.out.println(Arrays.toString(insertionSort(new int[] {5,4,1,3,2})));
	}
	
	public static int[] insertionSort(int[] nums)
	{
		for (int i=1;i<nums.length;i++)
		{
			int j=i-1;
			int curr= nums[i];
			while (j>=0 && nums[j]> curr)
				{
					nums[j+1]=nums[j];
					j--;
				}
			nums[j+1]=curr;
		}
		return nums;
	}

}
