package DSA.Practice;

import java.util.HashMap;

import org.testng.annotations.Test;

public class SubArrayWith0Sum {

	
	@Test
	public void testSubArray()
	{
		System.out.println(findSubArrayWith0Sum(new int[] {4, 2, -3, 1, 6}));
	}
	
	
	public boolean findSubArrayWith0Sum(int[] nums)
	{
		 int sum=0;
		 HashMap<Integer,Integer> map = new HashMap<>();
		 for (int i = 0; i < nums.length; i++) {
		 if(nums[i]==0) return true; // returning true if element is zero
		 sum+=nums[i]; // adding the elements in the sum 
		 if(map.containsKey(sum)) return true;// if Map is having the key same as sum return true , 
		 //since as per prefix sum concept if the two values are having same value then it is equal to zero 
		 map.put(sum, 1); // inserting the values on map with sum as key and default value as 1
		 }
		 return false;
		 }
	
	}
	
	
