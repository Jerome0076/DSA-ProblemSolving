package DSA.Practice;

import java.util.Map;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class AppendOccuracnces {

	@Test
	public void testAppendOccurance() {
		
		System.out.println(appendOccurances("aabbcccddeef"));
		
		System.out.println(appendOccurances("a"));
		
		System.out.println(appendOccurances("alpahabet"));
	}
	
	
	public String appendOccurances(String s)
	{
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		String resultStr = "";
		char[] ch = s.toCharArray();
		for(int i=0; i<s.length(); i++)
		{
			map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			resultStr = resultStr + entry.getKey()+entry.getValue().toString();
		}
		return resultStr;
	}
}
