package DSA.Practice;

import java.util.LinkedList;
import java.util.Queue;

import org.testng.annotations.Test;

public class TimeNeededToBuyTickets_2073 {

	@Test
	public void test()
	{
		int[] tickets = {2,3,2};
		int k = 2;
		System.out.println(timeRequiredToBuy(tickets, k));
	}
	
	public int timeRequiredToBuy(int[] tickets, int k) {
		int secondsCount = 0;
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> indexQueue = new LinkedList<>();

        // Adding tickets and their corresponding indices to the queues
        for (int i = 0; i < tickets.length; i++) {
            queue.add(tickets[i]);
            indexQueue.add(i);
        }

        while (!queue.isEmpty()) {
            // Safely poll values from both queues
            Integer queueValue = queue.poll();
            Integer currentIndex = indexQueue.poll();

            // Process the person at the front of the queue
            if (queueValue != null && currentIndex != null) {
                if (queueValue == 1) {
                    // This person finishes buying tickets
                    secondsCount++;
                    if (currentIndex == k) {
                        // Stop when the person at position `k` is done
                        break;
                    }
                } else {
                    // This person buys 1 ticket and goes to the back of the queue
                    queue.add(queueValue - 1);
                    indexQueue.add(currentIndex);
                    secondsCount++;
                }
            }
        }

        return secondsCount;
    }

}
