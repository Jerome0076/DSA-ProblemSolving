package Assesment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class GroupAnagram {
	
	@Test
	public void testAnagram()
	{
		System.out.println(groupAnagram(new String[] {"eat","tea","tan","ate","nat","bat"}));
		
		System.out.println(groupAnagram(new String[] {""}));
		
		System.out.println(groupAnagram(new String[] {"a"}));
	}
	/*
	 * Problem 4 Group Anagram
	 * 
	 * Input - ["eat","tea","tan","ate","nat","bat"]
	 * 
	 * Using for each loop copy all the elements to a Map<String, List<String>>
	 * 	-in loop, convert the string to charArray and sort it
	 * 	-add the sortedstr in the map and init a new ArrayList
	 *  -get the sorted string in map and add the unsorted string to the arraylist
	 * -return the map.values
	 * 
	 * 
	 * TC - O(n*nlogN)
	 * SC - O(n)
	 */
	
	public List<List<String>> groupAnagram(String[] str)
	{
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (String string : str) //O(n)
		{
			char[] ch = string.toCharArray();
			Arrays.sort(ch);	// O(nlogN)
			String sortedStr = new String(ch);
			if(!map.containsKey(sortedStr))
			{
				map.put(sortedStr, new ArrayList<>());
			}
			map.get(sortedStr).add(string);
			
		}
		return new ArrayList<>(map.values());
	}

}
