package DSA.Practice;

import org.testng.annotations.Test;

public class SquareRootOfX_69 {

	@Test
	public void testSqrRoot()
	{
		System.out.println(mySqrt(4));
		
		System.out.println(mySqrt(16));
		
		System.out.println(mySqrt(21));
		
		System.out.println(mySqrt(0));
		
		System.out.println(mySqrt(8));
	}
	
	/*
	 * Perform Binary Search between Start 1 and End as x
	 */
	public int mySqrt(int x) {
        
		if(x==0 || x ==1) 
		{
			return x;
		}
		
		long start = 1;
        long end = x;
        long mid = -1;

        // Perform binary search to find the square root of x.
        while (start <= end) {
            // Calculate the middle point using "start + (end - start) / 2" to avoid integer overflow.
            mid = start + (end - start) / 2;
            
//            mid = (start + end) / 2;

            // If the square of the middle value is greater than x, move the "end" to the left (mid - 1).
            if (mid * mid >  x)
                end = mid - 1;
            else if (mid * mid == x)
                // If the square of the middle value is equal to x, we found the square root.
                return  (int) mid;
            else
                // If the square of the middle value is less than x, move the "start" to the right (mid + 1).
                start = mid + 1;
        }

        // The loop ends when "start" becomes greater than "end", and "end" is the integer value of the square root.
        // However, since we might have been using integer division in the calculations,
        // we round down the value of "end" to the nearest integer to get the correct square root.
        return Math.round((int) end);
    }
}
