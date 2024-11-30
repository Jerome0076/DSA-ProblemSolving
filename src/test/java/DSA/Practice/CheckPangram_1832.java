package DSA.Practice;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class CheckPangram_1832 {
	
	@Test
	public void testPangram()
	{
		System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
		System.out.println(checkIfPangram("leetcode"));
		System.out.println(checkIfPangram("abcdefghijklmnopqrstuvwxyz"));
	}
	
	
	public boolean checkIfPangram(String sentence) {
      int sentenceLength = sentence.length();
      if(sentenceLength < 26) 
    	  {
    	  return false;
    	  }
      char[] charSentence = sentence.toCharArray();
      Set<Character> charSet = new HashSet<Character>();
      for(char c : charSentence)
      {
    	  charSet.add(c);
      }
	return charSet.size() == 26;
    }

}
