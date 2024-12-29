package DSA.Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.testng.annotations.Test;

public class StudentsUnableToEatLunch_1700 {

	@Test
	public void testStudentCount() {
		int[] students = {1,1,0,0};
		int[] sandwitches = {0,1,0,1};
		System.out.println(countStudents(students, sandwitches));
	}
	
	@Test
	public void testStudentCount1() {
		int[] students = {1,1,1,0,0,1};
		int[] sandwitches = {1,0,0,0,1,1};
		System.out.println(countStudents(students, sandwitches));
	}
	
	public int countStudents(int[] students, int[] sandwiches) {
        int count = 0;
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> queue = new LinkedList<Integer>();
		
		//Adding students to queue
		for(int student : students)
		{
			queue.add(student);
		}
		
		//Adding sandwitches to the stack in reverse order
		for(int i = sandwiches.length -1; i>=0; i--)
		{
			stack.push(sandwiches[i]);
		}
	
		while(!queue.isEmpty() && count < queue.size())
		{
			int stackValue = stack.peek();
			int queueValue = queue.peek();
			if(stackValue == queueValue)
			{
				System.out.println(queue.poll());
				stack.pop();
				System.out.println("Current Queue Size "+queue.size());
				System.out.println("Current Stack Size "+stack.size());
				count = 0;
			}
			else 
			{
                // Rotate the student to the back of the queue
                queue.add(queue.poll());
                count++;
            }
		}
		return queue.size();
    }
}
