package DSA.Practice;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class NumberOfSubstringContainingAllThreeCharacters_1358 {

	@Test
	public void testNumberOfSubstrings()
	{
		System.out.println(numberOfSubstrings("abcabc"));
		
		System.out.println(numberOfSubstrings("aaacb"));
	}
	
	public int numberOfSubstrings(String s) {
        int p1 = 0;
        int p2 = 0;
        int n = s.length();
        int maxCount = 0;
        Set<Character> hashSet = new HashSet<>();
        while(p2<n)
        {
        	if(!hashSet.contains(s.charAt(p2)))
        	{
        		hashSet.add(s.charAt(p2));
        	}
        	else
        	{
//        		hashSet.remove(s.charAt(p2));
        		p1++;
        		maxCount = Math.max(maxCount + p2 - p1 + 1, maxCount);
        	}
        	p2++;
        }
		return maxCount+1;
        
    }
}
