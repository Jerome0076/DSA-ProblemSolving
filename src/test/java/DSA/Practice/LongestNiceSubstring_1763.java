package DSA.Practice;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class LongestNiceSubstring_1763 {

	@Test
	public void testLongestNiceSubstring()
	{
		System.out.println(longestNiceSubstring("ryanaaAsourarous"));
		
		System.out.println(longestNiceSubstring("AAa"));
	}

	    public String longestNiceSubstring(String s) {
	        if (s == null || s.length() < 2) return "";

	        int maxLength = 0;
	        String result = "";

	        // Use two pointers to iterate through all possible substrings
	        for (int start = 0; start < s.length(); start++) {
	            for (int end = start + 1; end <= s.length(); end++) {
	                String substring = s.substring(start, end);
	                if (isNice(substring) && substring.length() > maxLength) {
	                    maxLength = substring.length();
	                    result = substring;
	                }
	            }
	        }
	        return result;
	    }

	    // Helper function to check if a substring is nice
	    private boolean isNice(String s) {
	        Set<Character> charSet = new HashSet<>();
	        for (char c : s.toCharArray()) {
	            charSet.add(c);
	        }

	        // Check if every character in the set has both its lowercase and uppercase forms
	        for (char c : charSet) {
	            if (Character.isLowerCase(c) && !charSet.contains(Character.toUpperCase(c))) {
	                return false;
	            }
	            if (Character.isUpperCase(c) && !charSet.contains(Character.toLowerCase(c))) {
	                return false;
	            }
	        }
	        return true;
	    }
}
