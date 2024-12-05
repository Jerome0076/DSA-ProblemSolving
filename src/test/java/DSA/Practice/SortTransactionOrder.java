package DSA.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class SortTransactionOrder {
	
	@Test
	public void testTransactions()
	{
		List<String> transactions = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana", "banana"));
		sortTransaction(transactions);
	}
	
	public void sortTransaction(List<String> list) {
		
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		for (String listItem : list)
		{
			map.put(listItem, map.getOrDefault(listItem, 0)+1);
		}
		ArrayList<Map.Entry<String, Integer>> arrayList = new ArrayList<>(map.entrySet());
		arrayList.sort((i1, i2)->i2.getValue().compareTo(i1.getValue()));
		System.out.println(arrayList);

		for(Map.Entry<String, Integer> entry : arrayList)
		{
			 System.out.print(entry.getKey() + " : " + entry.getValue()+" ");
		}
	}
}
