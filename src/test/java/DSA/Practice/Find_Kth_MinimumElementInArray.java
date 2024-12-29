package DSA.Practice;

import java.util.PriorityQueue;

import org.testng.annotations.Test;

public class Find_Kth_MinimumElementInArray {

	
	@Test
	public void testKthMinEle()
	{
		int[] nums = {3, 5, 1, 8, 12};
		int k = 2;
		System.out.println(findKthMinElement_Alternate(nums, k));
		System.out.println(findKthMinElement(nums, k));
		
	}
	
	//2nd Complexity Reduction method
	public int findKthMinElement_Alternate(int[] nums, int k)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> b-a);
		for(int i = 0 ; i < k ; i++)
		{
			pq.add(nums[i]);
		}
		for(int i = k ; i < nums.length; i++)
		{
			if (nums[i] < pq.peek()) {
	            pq.poll(); // Remove the largest
	            pq.add(nums[i]); // Add the current element
	        }
		}
		return pq.peek();
	}
	
	//Normal Approch
	
	public int findKthMinElement(int[] nums, int k)
	{
		// Step 1: Add all elements to a min-heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
        }

        // Step 2: Remove the smallest element (k-1) times
        for (int i = 1; i < k; i++) {
            minHeap.poll();
        }

        // Step 3: The root of the heap is the kth smallest element
        return minHeap.peek();
	}
}
