package DSA.Practice;

import org.testng.annotations.Test;

public class TrappingRainWater {

	@Test
	public void testTrappingWater()
	{
		System.out.println(trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
	}
	
	/*
	 * 42.Trapping Rain Water
	 */
	
	public int trap(int[] height) {
        int ans =0;
        int[] leftMaxHeight = new int[height.length];
        int[] rightMaxHeight = new int[height.length];
        
        //Assigning same value as input for left and right max values
        leftMaxHeight[0] = height[0];
        rightMaxHeight[rightMaxHeight.length-1] = height[height.length-1];
        
        //Find left Max Heights
        for(int i = 1; i<height.length; i++)
        {
        	leftMaxHeight[i] = Math.max(leftMaxHeight[i-1], height[i]);
        }
        
        //Find Right Max Heights
        for(int i = rightMaxHeight.length-2; i>=0; i--)
        {
        	rightMaxHeight[i] = Math.max(rightMaxHeight[i+1], height[i]);
        }
        
        for(int i=0; i<height.length; i++)
        {
        	ans = ans + Math.max(0, Math.min(leftMaxHeight[i], rightMaxHeight[i])) - height[i];
        }
        return ans;
    }
	
}
