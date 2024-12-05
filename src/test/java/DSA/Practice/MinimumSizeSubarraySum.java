package DSA.Practice;

import org.testng.annotations.Test;

public class MinimumSizeSubarraySum {
	
	@Test
	public void testMinSubArrayLen()
	{
		System.out.println(minSubArrayLen(7, new int[] {2,3,1,2,4,3}));
		
		System.out.println(minSubArrayLen(4, new int[] {1,4,4}));
		
		System.out.println(minSubArrayLen(11, new int[] {1,1,1,1,1,1,1,1}));
	}
	
	/*
	 * Pseudo code
	 *intialize variables p1, p2 =0, minlen=0
	 *sum=0
	 *while(p2<lengthof array)
	 *	sum+=array of p2
	 *	while(sum>=target)
	 *		minlen=Math.min(minlen,p2-p1+1)
	 *		sum-=array of p1
	 *		p1++;
	 * 	P2++;
	 */
	public int minSubArrayLen(int target, int[] nums) {
        int p1 = 0;
        int p2 = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
		
		
		while(p2<nums.length)
		{
			sum = sum+nums[p2];
			while(sum>=target)
			{
				minLen = Math.min(minLen, p2-p1+1);
				sum = sum-nums[p1];
				p1++;
			}
			p2++;
		}
		if(minLen==Integer.MAX_VALUE) {
			return 0;
		}
		else 
			{
			return minLen;
			}
    }

}
