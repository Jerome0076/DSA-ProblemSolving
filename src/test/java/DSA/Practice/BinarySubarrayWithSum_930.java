package DSA.Practice;

import org.testng.annotations.Test;

public class BinarySubarrayWithSum_930 {

	@Test
	public void testBinarySubarray()
	{
		System.out.println(numSubarraysWithSum(new int[] {1,0,1,0,1}, 2));
		
		System.out.println(numSubarraysWithSum(new int[] {0,0,0,0,0}, 0));
	}
	
	public int numSubarraysWithSum(int[] nums, int goal)
    {
        return SubarraysWithSum(nums, goal) - SubarraysWithSum(nums, goal-1);
    }
	
	
    public int SubarraysWithSum(int[] nums, int goal) {
        int output=0,sum=0, i=0,j=0;
		if(goal>=0)
		{
			while(j<nums.length)
			{
				sum+=nums[j];
				while(sum>goal)
				{
					sum-=nums[i];
					i++;
				}
                if(sum<=goal)
					output+=j-i+1;
				j++;
			}
		}
		
		return output;
	
	}

}
