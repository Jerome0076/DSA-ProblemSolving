package DSA.Practice;

import org.testng.annotations.Test;

public class DiagonalSum {

	@Test
	public void testDiagonalSum()
	{
		diagonalSum(new int[][] {
			{1,2,3,4,5},
			{4,5,6,5,6},
			{7,8,9,7,8},
			{1,2,3,4,5},
			{1,2,3,4,5}});
	}
	
//	int[][] nums={{1,2,3},{4,5,6},{7,8,9}};
//    int sum=0;
//    // go over the rows
//    // O(n^2)
//    for (int i=0;i<nums.length;i++){
//        // go over the colums
//        for(int j=0;j<nums[0].length;j++){
//            sum+=nums[i][j];
//        }
//    }
//    System.out.println(Arrays.deepToString(nums));
//    System.out.println(sum);
//}

	public void diagonalSum(int[][] matrix)
	{
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        // Calculate the primary and secondary diagonal sums
        for (int i = 0; i < matrix.length; i++) {
            primaryDiagonalSum = primaryDiagonalSum + matrix[i][i];         // Primary diagonal (0,0), (1,1), (2,2)
            secondaryDiagonalSum = secondaryDiagonalSum + matrix[i][matrix.length-1 - i]; // Secondary diagonal (0,2), (1,1), (2,0)
        }

        int totalDiagonalSum = primaryDiagonalSum + secondaryDiagonalSum;

        // If the matrix size is odd, subtract the middle element (as it's counted twice)
        if (matrix.length % 2 != 0) {
        	int mid = (matrix.length-1)/2;
            totalDiagonalSum = totalDiagonalSum-matrix[mid][mid];
        }

        // Output the results
        System.out.println("Primary Diagonal Sum: " + primaryDiagonalSum);
        System.out.println("Secondary Diagonal Sum: " + secondaryDiagonalSum);
        System.out.println("Total Diagonal Sum: " + totalDiagonalSum);
    }
}


