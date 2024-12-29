package DSA.Practice;

import java.util.PriorityQueue;

import org.testng.annotations.Test;

public class ConnectRopes {
/*
 * Given are N ropes of different lengths, 
 * the task is to connect these ropes into one rope with minimum cost, 
 * such that the cost to connect two ropes is equal to the sum of 
 * their lengths.

	Input: arr[] = {4,3,2,6} , N = 4
	Output: 29
	Explanation:
	First, connect ropes of lengths 2 and 3. Now we have three ropes of lengths 4, 6, and 5.
	Now connect ropes of lengths 4 and 5. Now we have two ropes of lengths 6 and 9.
	Finally connect the two ropes and all ropes have connected.
 */
	@Test
	public void testminCost()
	{
		System.out.println(minCost(new int[] {4,3,2,6}));
	}
	
	public static int minCost(int[] ropes) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int cost,result = 0;
		for(int i = 0; i < ropes.length; i++)
		{
			pq.add(ropes[i]);
		}
		
		while(pq.size() > 1)
		{
			int first = pq.poll();
			int second = pq.poll();
			cost = first+second;
			pq.add(cost);
			result = result + cost;
		}
		return result;
    }
}
