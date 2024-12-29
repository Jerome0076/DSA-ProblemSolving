package DSA.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class N_MeetingsInOneRoom_GFG {
	
	@Test
	public void testMaxMeetings()
	{
		int[] start = {1, 3, 0, 5, 8, 5};
		int[] end = {2, 4, 6, 7, 9, 9};
		System.out.println(maxMeetings(start, end));
	}

	public int maxMeetings(int start[], int end[]) {
		int maxCount = 0;
		int n = start.length;
		
		//Convert to 2D Array
		int[][] meetings = new int[n][2];
        for (int i = 0; i < n; i++) {
            meetings[i][0] = end[i]; // End time
            meetings[i][1] = start[i]; // Start time
        }
        
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        
        int lastEndTime = 0;
        for(int i = 0; i<n ; i++)
        {
        	if(meetings[i][1] > lastEndTime)
        	{
        		maxCount++;
        		lastEndTime = meetings[i][0];
        	}
        }
		return maxCount;
    }
}
