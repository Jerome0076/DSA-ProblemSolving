package DSA.Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.testng.annotations.Test;

public class RemoveFirst_K_ElementsOfTheQueue_GFG {

	@Test
	public void test()
	{
		Queue<Integer> nums = new LinkedList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
		int k=3;
		System.out.println(modifyQueue(nums, k));
	}
	
	public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
		
		Stack<Integer> s = new Stack<>();
		
		for(int i = 0; i<k; i++)
		{
			s.push(q.poll());
		}
		System.out.println(s.toString());
		while(!s.isEmpty())
		{
			q.offer(s.pop());
		}
		System.out.println(q.toString());
		int remaining = q.size() - k;
        for (int i = 0; i < remaining; i++) {
            q.offer(q.poll());
        }

        return q;
    }
	
}
