package DSA.Practice;

import org.testng.annotations.Test;

public class RearrangePositiveAndNegativeInArray {

	@Test
	public void testArrayRearrange()
	{
		rearrangeArrayPveAndNve(new int[] {3, -2, 5, -8, -9, 4, 10, -1});
	}
	
	/*
	 * Pseudocode
	 * 
	 */
	public void rearrangeArrayPveAndNve(int[] arr)
	{
		int arrLength = arr.length;
		int p1 = 0 , p2 = 0;
		while (p1<arrLength && p2<arrLength) 
		{
			if((p1 % 2 == 0 && arr[p1]>0) || (p1 % 2 == 1 && arr[p1]<0))
			{
				p1++;
			}
			else if ((p2 % 2 == 0 && arr[p2]>0) || (p2 % 2 == 1 && arr[p2]<0))
			{
				p2++;
			}
			else if (p1 < p2)
			{
				int temp = arr[p1];
				arr[p1] = arr[p2];
				arr[p2] = temp;
			}
			else
			{
				p2++;
			}			
		}
		for (int num : arr) {
            System.out.print(num + " ");
        }				
	}
	
}
