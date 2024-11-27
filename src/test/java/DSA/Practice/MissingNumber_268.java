package DSA.Practice;

import org.testng.annotations.Test;

public class MissingNumber_268 {
	
	@Test
	public void testMissingNumber()
	{
		System.out.println(missingNumber(new int[] {3,0,1}));
		
		System.out.println(missingNumber(new int[] {0,1}));
		
		System.out.println(missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
	}
	
    public int missingNumber(int[] nums) {
        /*
        Given the integer array with fixed length
        Get the length of the array
        using the numbers in the array is always within the given range
        iterate using a for loop to find the missing value
        */
        // int arrayLength = nums.length;
        // int missingNumber = 0;
        
        // for(int i=0; i<=arrayLength; i++)
        // {
        //     boolean missingValue = false;
        //     for(int num : nums)
        //     if(num==i)
        //     {
        //         missingValue = true;
        //         break;
        //     }
        //     if(!missingValue)
        //     {
        //         i = missingNumber;
        //     }
        // }
        // return missingNumber;

        int n = nums.length;
        
        // Check for every number from 0 to n
        for (int i = 0; i <= n; i++) {
            boolean found = false;
            
            // Search for i in the array
            for (int num : nums) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            
            // If i is not found, it is the missing number
            if (!found) {
                return i;
            }
        }
        
        // This line will never be reached because one number is always missing
        return -1;
    }
}

	

