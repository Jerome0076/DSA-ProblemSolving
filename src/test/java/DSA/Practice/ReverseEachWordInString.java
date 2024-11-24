package DSA.Practice;

import org.testng.annotations.Test;

public class ReverseEachWordInString {
	
	@Test
	public void testreverseEachWord()
	{
		reverseEachWord("Welcome to Testleaf");
	}
	
	public void reverseEachWord(String string)
	{
	    String[] str = string.split(" ");
	    StringBuilder result = new StringBuilder();

	    for (String word : str) {
	        // Convert the word into a character array
	        char[] wordChars = word.toCharArray();

	        // Reverse the word using two-pointer method
	        reverse(wordChars, 0, wordChars.length - 1);

	        // Append the reversed word to the result
	        result.append(new String(wordChars)).append(" ");
	    }

	    // Print the final result, trimmed to remove trailing space
	    System.out.println(result.toString().trim());
	}
	
		
		private static void reverse(char[] array, int left, int right) {
	        while (left < right) {
	            // Swap characters
	            char temp = array[left];
	            array[left] = array[right];
	            array[right] = temp;
	            left++;
	            right--;
	        }
	}

}
