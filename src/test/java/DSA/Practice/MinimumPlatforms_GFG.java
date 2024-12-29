package DSA.Practice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MinimumPlatforms_GFG {

	@Test
	public void testMinimumPlatforms()
	{
		int[] arr = {900, 940, 950, 1100, 1500, 1800};
		int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
		System.out.println(findPlatform(arr, dep));
	}
	
	@Test
	public void testMinimumPlatforms1()
	{
		int[] arr = {900, 1235, 1100};
		int[] dep = {1000, 1240, 1200};
		System.out.println(findPlatform(arr, dep));
	}
	
	@Test
	public void testMinimumPlatforms2()
	{
		int[] arr = {1000, 935, 1100};
		int[] dep = {1200, 1240, 1130};
		System.out.println(findPlatform(arr, dep));
	}
	
	public int findPlatform(int[] arr, int[] dep)
	{
		int i = 0;
		int j = 0;
		int count = 0;
		int platform = 0;
		Arrays.sort(arr);
		Arrays.sort(dep);
		
		while(i < arr.length)
		{
			if(arr[i] <= dep[j])
			{
				count++;
				i++;
			}
			else
			{
				count--;
				j++;
			}	
			platform = Math.max(count, platform);
		}
		return platform;
	}
}
