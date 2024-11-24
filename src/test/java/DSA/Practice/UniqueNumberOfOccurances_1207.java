package DSA.Practice;

import java.util.HashMap;
import java.util.HashSet;
import org.testng.annotations.Test;

public class UniqueNumberOfOccurances_1207 {

	@Test
	public void testUniqueOccurances()
	{
		System.out.println(uniqueNumberOfOccurances(new int[] {1,2,2,1,1,3}));
	}
	
	public boolean uniqueNumberOfOccurances(int[] nums)
	{
		/*
		 * Pseudocode.
		 * arr = [1,2,2,1,1,3]
		 * -Init Hash Map
		 * - Iterate throgh the given Array;
		 * 		-  (if map.getOrDefault0,+1)
		 * 			-return false;
		 * 		else
		 * 		-
		 */
		HashMap<Integer, Integer> map = new HashMap<>();
		boolean result = false;
		for(int i = 0 ; i<nums.length; i++)
		{
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		
		HashSet<Integer> hashSet = new HashSet<>(map.values());
		int mapSize = map.values().size();
		int hashSize = hashSet.size();
		if(mapSize == hashSize)
		{
			result = true;
		}
		return result;
	}
	
	
}
