package stacks;

import java.util.Stack;

public class StackEx1 {
	
	public static void main(String[] arg) {
		
		// initializes new String stack variable
		Stack<String> myStack = new Stack<String>();
		
		// pushes four entries onto stack
		myStack.push("Adam");
		myStack.push("Jane");
		myStack.push("John");
		myStack.push("Suzy");
		
		// prints stack order
		System.out.println("Current stack order (LIFO) is: " + myStack);
		
		// prints most recent stack entry via peek() method
		System.out.println("Most recent entry/top of stack is: " + myStack.peek());
		
		// removes most recent entry from stack
		myStack.pop();
		
		// prints new stack with most recent entry removed/popped
		System.out.println("New stack order after pop() is: " + myStack);
		
		// clears entire stack
		myStack.clear();
		
		// prints whether or not stack is empty via isEmpty() method
		System.out.println("Is stack empty after clear()? Answer: " + myStack.isEmpty());			
	}
}
