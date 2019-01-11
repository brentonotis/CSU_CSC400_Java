package queues;

import java.util.*;

public class QueueEx1 {
	
	public static void main (String[] args) {
		
		//Initializes new linked list queue (of integers)
		Queue<Integer> myQueue = new LinkedList<>();
		
		//Add integers 1-5 to queue
		for (int i = 1; i < 6; i++)
			myQueue.add(i);
		
		//Print queue
		System.out.println("Queue contains: " + myQueue);
		
		//Remove/print head of queue
		System.out.println("Removed head of queue: " + myQueue.remove());
		
		//Print new queue (w/ previous head removed)
		System.out.println("Queue now comtains: " + myQueue);
		
		//View (but do not remove) head of queue
		System.out.println("New head of queue: " + myQueue.peek());
		
		//View new size of queue
		System.out.println("New size of queue: " + myQueue.size());
	}
}

