package DSA.Practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class UncommonCharacters {

	@Test
	public void testUncommonCharacters() {
		System.out.println(findUncommonCharacters("characters", "alphabets"));
		
		System.out.println(findUncommonCharacters("geeksforgeeks", "geeksquiz"));
		
		System.out.println(findUncommonCharacters("aaa", "bba"));
		
	}

	public Collection<Character> findUncommonCharacters(String s1, String s2) {
		  // Count frequencies of characters in both strings
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        
        // Count characters in s1
        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        // Count characters in s2
        for (char c : s2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        // Set to collect uncommon characters
        Set<Character> uncommon = new LinkedHashSet<>();

        // Add characters from s1 that are not in s2
        for (char c : map1.keySet()) {
            if (!map2.containsKey(c)) {
                uncommon.add(c);
            }
        }

        // Add characters from s2 that are not in s1
        for (char c : map2.keySet()) {
            if (!map1.containsKey(c)) {
                uncommon.add(c);
            }
        }

        return uncommon;
    }
}

