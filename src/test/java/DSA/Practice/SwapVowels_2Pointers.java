package DSA.Practice;

import org.testng.annotations.Test;

public class SwapVowels_2Pointers {
	
	@Test
	public void testSwapVowels()
	{
		System.out.println(swapVowels("TestLeaf"));
		System.out.println(swapVowels("Hello Everyone! Welcome to Testleaf"));
		System.out.println(swapVowels("Jer"));
	}

	public String swapVowels(String value)
	{
		char[] chars = value.toCharArray();
		String vowels = "aeiouAEIOU";
		int p1 = 0;
		int p2 = value.length()-1;
		
		while (p1 < p2) {
            // Move the p1 pointer to the next vowel
            while (p1 < p2 && vowels.indexOf(chars[p1]) == -1) {
                p1++;
            }
            // Move the p2 pointer to the previous vowel
            while (p1 < p2 && vowels.indexOf(chars[p2]) == -1) {
                p2--;
            }
			 // Swap the vowels
            if (p1 < p2) {
                char temp = chars[p1];
                chars[p1] = chars[p2];
                chars[p2] = temp;
                p1++;
                p2--;
            }			
		}
		return new String(chars);
	}	
}
