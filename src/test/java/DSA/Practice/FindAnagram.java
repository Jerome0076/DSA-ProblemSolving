package DSA.Practice;

import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;

public class FindAnagram {

	@Test
	public void testCheckAnagram()
	{
		System.out.println(checkAnagram("geeks", "skege"));
		
		System.out.println(checkAnagram("allergic", "allergy"));
		
		System.out.println(checkAnagram("abc", "abca"));
		
		System.out.println(checkAnagram("skagen", "genkes"));
	}
	
	/*
	 * Init boolean as false
	 * 	if both both strings are of same length proceed with test else return false
	 * Add s1 to map with occurance
	 * Subtract s2 in map with occurance
	 * if value is more than 0
	 * 		return false
	 * else
	 * 		return true
	 *
	 *
	 *TC - O(n)
	 *SC - O(1)
	 */
	public boolean checkAnagram(String s1, String s2)
	{
		Map<Character, Integer> map = new HashMap<>();
		//If length of s1 amd s2 not equal return false
		if(s1.length() != s2.length())
		{
			return false;
		}
		for(int i=0; i<s1.length(); i++)
		{
			map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0)+1);
		}
		
		for(int i=0; i<s2.length(); i++)
		{
			if(!map.containsKey(s2.charAt(i)))
			{
				return false;
			}
			map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0)-1);
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			if(entry.getValue()>0)
			{
				return false;
			}
			else 
			{
				return true;
			}
		}
		return false;
	}
}
