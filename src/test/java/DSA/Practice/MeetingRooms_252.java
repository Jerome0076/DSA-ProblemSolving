package DSA.Practice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MeetingRooms_252 {

	@Test
	public void testmeetingrooms()
	{
		System.out.println(findMeetings(new int[][] {{0,30},{5,10},{15,20}}));
		
		System.out.println(findMeetings(new int[][] {{0,4},{5,10},{15,20}}));
	}
	
	
	/*
	 * Pseudocode
	 * Sort the arrays
	 * Assign StartTime, EndTime
	 */
	public boolean findMeetings(int[][] nums) 
	{
		Arrays.sort(nums, (a,b)->a[0]-b[0]);
		int startTime = nums[0][0];
		int endTime = nums[0][1];
		
		for(int i = 1; i<nums.length; i++)
		{
			if(nums[i][0] < endTime)
			{
				return false;
			}
			else
			{
				startTime = nums[i][0];
				endTime = nums[i][1];
			}
		}
		return true;
	}
}
