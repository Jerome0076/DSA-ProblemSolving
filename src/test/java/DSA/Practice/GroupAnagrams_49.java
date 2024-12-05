package DSA.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;



public class GroupAnagrams_49 {

	@Test
	public void testGroup()
	{
		System.out.println(groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));
	}
	
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
            for(String s : strs)
            {
                char[] ch = s.toCharArray();
                Arrays.sort(ch);
                String sortedStr = new String(ch);

                if(!map.containsKey(sortedStr))
                {
                    map.put(sortedStr, new ArrayList<>());
                }
                map.get(sortedStr).add(s);
            }
            return new ArrayList<>(map.values());
    }
}
