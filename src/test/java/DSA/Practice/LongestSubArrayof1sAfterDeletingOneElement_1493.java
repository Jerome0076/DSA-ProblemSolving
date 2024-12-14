package DSA.Practice;

import org.testng.annotations.Test;

public class LongestSubArrayof1sAfterDeletingOneElement_1493 {

	@Test
	public void testLongestSubarray()
	{
		System.out.println(longestSubarray(new int[] {1,1,0,1}));
		
		System.out.println(longestSubarray(new int[] {0,1,1,1,0,1,1,0,1}));
		
		System.out.println(longestSubarray(new int[] {1,1,1}));
	}
	public int longestSubarray(int[] nums) {
		int result = 0;
		int p1 = 0;
		int p2 = 0;
		int zeroCount = 0;
		int arrLength = nums.length;
		
		while(p2 < arrLength)
		{
			if(nums[p2] == 0)
			{
				zeroCount++;
			}
			while(zeroCount > 1)
			{
				if(nums[p1] == 0)
				{
					zeroCount--;
				}
				p1++;
			}
			result = Math.max(result, p2-p1+1-zeroCount);
			p2++;
		}
        if(result == arrLength)
        {
            return result - 1;
        }
        else 
        {
            return result;
        }
    }
}
