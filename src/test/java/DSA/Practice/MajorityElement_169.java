package DSA.Practice;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class MajorityElement_169 {
	
	@Test
	public void testMajorityElement()
	{
		majorityElement(new int[] {3,2,3});
		majorityElement(new int[] {2,2,1,1,1,2,2});
	}
	
	/*
	 * Pseudocode
	 * Init Map and load all occurances in the MAP
	 * Init Majority element and majority value as 0
	 * Iterate via Map.Entry and 
	 * 		- IF entry.getValue()>majorityValue
	 * 			-majorityElement = map.getKey;
	 * 			-majorityValue = map.getValue
	 * 		-return majorityElement
	 */
	public int majorityElement(int[] nums) {
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	for(int num : nums)
	{
		map.put(num, map.getOrDefault(num, 0)+1);
	}
	int majorityElement = 0;
	int majorityValue = 0;
	for(Map.Entry<Integer, Integer> entry : map.entrySet())
	{
		System.out.println(entry.toString());
		if(entry.getValue()>majorityValue)
		{
			majorityValue = entry.getValue();
			majorityElement = entry.getKey();
		}
	}
	return majorityElement;
	}
	
}
