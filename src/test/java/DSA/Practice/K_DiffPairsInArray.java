package DSA.Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.Validate;
import org.testng.annotations.Test;

import io.cucumber.java.tlh.vaj;

public class K_DiffPairsInArray {

	@Test
	public void testfindPairs()
	{
		System.out.println(findPairs(new int[] {3,1,4,1,5}, 2));
		System.out.println(findPairs_HashMap(new int[] {3,1,4,1,5}, 2));
		
		System.out.println(findPairs(new int[] {1,2,3,4,5}, 1));
		System.out.println(findPairs_HashMap(new int[] {1,2,3,4,5}, 1));
		
		System.out.println(findPairs(new int[] {1,3,1,5,4}, 0));
		System.out.println(findPairs_HashMap(new int[] {1,3,1,5,4}, 0));
	}
	
	/*
	 * Pseudocode
	 * Get Length of nums
	 * Have nested For Loops
	 *  -for(i=0; i<nums.length; i++)
	 *  	-for(j=0; j<nums.length; j++)
	 *  		-if(nums[i]-nums[j] == k)
	 *  			return i
	 */
	public int findPairs(int[] nums, int k) {
		Arrays.sort(nums);
		int numLength = nums.length;
		int count = 0;
		for(int i = 0; i<numLength; i++)
		{
			for(int j = i+1; j<numLength; j++)
			{
				if(nums[j]-nums[i]==k)
				{
					count++;
				}
			}
		}
        return count;
    }
	
	public int findPairs_HashMap(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : nums)
		{
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		//nums[i]-nums[j]=k
		//nums[i]=k + nums[j]
		int count=0;
		for (int val : map.keySet())
		{
			if(k>0 && map.containsKey(val+k))
			{
				count++;
			}
			else if (k==0 && map.get(val)>1)
			{
				count++;
			}
			
		}
		return count;
    }
}
