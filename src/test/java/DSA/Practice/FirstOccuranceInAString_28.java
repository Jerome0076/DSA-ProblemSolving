package DSA.Practice;

import org.testng.annotations.Test;

public class FirstOccuranceInAString_28 {
	
		@Test
		public void testFirstOccurance()
		{
			System.out.println(strStr("sadbutsad", "sad"));
			System.out.println(strStr("hello", "ll"));
			System.out.println(strStr("a", "a"));
		}
		
		/*
	    *Pseudocode:
	    * GetLength of Haystack and Needle
	    * In For Loop Iterate the String
	    * String.substring(i , i+NeedleLength).equal(needle)
	    * 
	    */
		
	    public int strStr(String haystack, String needle) {
	    	int strLength = haystack.length();
	    	int needleLength = needle.length();
	        for(int i = 0; i<=strLength-needleLength; i++)
	        {
        		String chkString = haystack.substring(i, i+needleLength);
        		System.out.println(chkString);
        		if(chkString.equals(needle))
        		{
        			return i;
        		}
	        	
	        }
	        return -1;
	    }

}
