package DSA.Practice;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class LongestSubstringWithoutRepeatingCharacters_3 {
	
	@Test
	public void testlengthOfLongestSubstring()
	{
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		
		System.out.println(lengthOfLongestSubstring("bbbbb"));
		
		System.out.println(lengthOfLongestSubstring("pwwkew"));
		
	}
	public int lengthOfLongestSubstring(String s) {
		int j = 0;
		int maxLength = 0;
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<s.length(); i++)
		{
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
			
			while(map.get(s.charAt(i))>1)
			{
				map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)-1);
				j++;
			}
			
			maxLength = Math.max(maxLength, i-j+1);
		}
		return maxLength;
        
    }

}
