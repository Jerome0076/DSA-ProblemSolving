package DSA.Practice;

import org.testng.annotations.Test;

public class ShortestDistanceToACharacter {	
	
	@Test
	public void testShortestdistance()
	{
		shortestDistance("loveleetcode", "e");
	}
	
	/*
	 * Pseudocode
	 *  - init variable count=s.length();
		- init int array of string size
		- iterate the array from 0->n-1
		- if(str[i]=='e') count=0;
			output[i]=count++;
		
		count=s.length();
		- iterate the array from n-1->0
		- if(str[i]=='e') count=0;
		output[i]=Math.min(count, output[i]);

	 */
	public void shortestDistance(String str, String target)
	{
		int count = str.length();
		int[] arrayOutput = new int[str.length()];
		char[] chars = str.toCharArray();
		
		for(int i = 0; i<chars.length; i++)
		{
			if(target.indexOf(chars[i]) != -1)
			{
				count = 0;
			}
			arrayOutput[i] = count;
			count++;
		}
		
		count = str.length();
		for(int i=chars.length-1;i>=0;i--)
		{
			if(target.indexOf(chars[i]) != -1)
			{
				count = 0;
			}
			arrayOutput[i]=Math.min(count, arrayOutput[i]);
			count++;
		}
		
		// Print the output array
	    for (int num : arrayOutput) {
	        System.out.print(num + " ");
	    }
	}
}
