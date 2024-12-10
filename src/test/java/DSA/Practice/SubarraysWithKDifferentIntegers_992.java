package DSA.Practice;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class SubarraysWithKDifferentIntegers_992 {

	@Test
	public void test()
	{
		System.out.println(testSubarray(new int[] {1,2,3,1,2}, 2));
	}
	
	/*
	 * Function atMostK(nums, K):
		Initialize p1 = 0, p2 = 0, count = 0, and an empty map
		While p2 < length of nums:
		    Add nums[p2] to map
		    While map size > K:
		        Remove nums[p1] from map and increment p1
		    Increment count by (p2 - p1 + 1)
		    Increment p2
		Return count
	 */
	
	public int testSubarray(int[] nums, int k)
	{
		return subArrayWithDifferentIntegers(nums, k) - subArrayWithDifferentIntegers(nums, k-1);
	}
	
	public int subArrayWithDifferentIntegers(int[] nums, int k )
	{
		
		int p1 = 0;
		int p2 = 0;
		int count = 0;
		if (k == 0) return 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		while(p2<nums.length)
		{
			map.put(nums[p2], map.getOrDefault(nums[p2], 0)+1);
			while(map.size() > k)
			{
				map.put(nums[p1], map.get(nums[p1]) - 1);
				if(map.get(nums[p1]) == 0)
				{
					map.remove(nums[p1]);
				}
				p1++;
			}
			
			count = count + p2 - p1 + 1;
			
			p2++;
		}		
		return count;
	}	
}
