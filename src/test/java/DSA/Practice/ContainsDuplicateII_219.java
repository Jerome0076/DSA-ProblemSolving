package DSA.Practice;

import java.util.HashMap;

import org.testng.annotations.Test;

public class ContainsDuplicateII_219 {

	@Test
	public void testContainsDuplicatesII()
	{
		System.out.println(containsNearbyDuplicate(new int[] {1,2,3,1} , 3));
	}
	
	
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	
    	/*
    	 * Psuedocode
    	 * Input Array {1,2,3,1} k =3
    	 *  -Init a HashMap
    	 *  	- for loop and identify nums[i]=nums[j]
    	 *  
    	 *  - Initialise hashmap
			- iterate the array and load entries
			- before adding check if nums[i] is already there and i-map.get(nums[i])<k
				- if yes return true
				- else return false
    	 */
    	
    	HashMap<Integer, Integer> map = new HashMap<>();
    	boolean result = false;
    	for(int i = 0; i<nums.length; i++)
    	{
    		if(map.containsKey(nums[i]) && i-map.get(nums[i])<=k)
    		{    			
    			result = true;
    		}
    		else
    		{
    			map.put(nums[i], i);
    		}
    	}
    	return result;
}	
}
