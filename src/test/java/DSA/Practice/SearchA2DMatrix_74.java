package DSA.Practice;

import org.testng.annotations.Test;

public class SearchA2DMatrix_74 {

	@Test
	public void testSearchMatrix() {
        System.out.println(searchMatrix(new int[][] {{1,3,5,7},
        											{10,11,16,20},
        											{23,30,34,60}}, 3));
        
        System.out.println(searchMatrix(new int[][] {{1,3,5,7},
			{10,11,16,20},
			{23,30,34,60}}, 13));
    }
	
	
	//Binary Search
	/*
	 * Convert a 2D Array into 1D Array and search for the target position
	 * row = mid/column length
	 * column = mid % column length
	 * matrix [row][column]
	 * 
	 * 
	 */
	public boolean searchMatrix(int[][] matrix, int target) {
		int row = matrix.length;
		int column = matrix[0].length;
		
		int low = 0;
		int high = row * column - 1;
		
		while(low<=high)
		{
			int mid = (low + high)/2;
			int i = mid / column;
			int j = mid % column;
			int value = matrix[i][j];
			
			if(value == target)
			{
				return true;
			}
			else if(value < target)
			{
				low = mid + 1;
			}
			else
			{
				high = mid - 1;
			}
		}		
		return false;
    }
	
}
