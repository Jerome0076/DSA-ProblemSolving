package DSA.Practice;

import org.testng.annotations.Test;

public class FindSecondLargestIntegerInArray {

	@Test
	public void testSecondMax()
	{
		System.out.println(findSecondMax(new int[] {1,2,3,4,6,7}));
		
		System.out.println(findSecondMax(new int[] {1,2,3,4,7,6,5}));
	}
	
	
	public int findSecondMax(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		
		for (int i = 0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				secondMax = max;
				max = arr[i];
//				secondMax = max;
			}
			else if(secondMax < arr[i] && secondMax < max)
			{
				secondMax = arr[i];
			}
		}
		return secondMax;
	}
}
