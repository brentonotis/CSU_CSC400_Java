package stacks2;

/**
 * Program that reads postfix expression and evaluates/returns result
 * @author Brenton Otis
 * --> throws EmptyStackException when evaluating second scenario; Need to fix
 */

import java.util.*;

public class PostfixCalculator {

	public static int evaluatePostfix(String postfix) {
		
		// Initialize new/empty stack
		Stack<Integer> valueStack = new Stack<>();
		
		// Read through all characters
		for(int i = 0; i < postfix.length(); ++i) {
			char character = postfix.charAt(i);
			// Ignore spaces
			if(character == ' ') continue;
			
			// If character is operand, push to stack
			if(Character.isDigit(character)) {
				valueStack.push(character - '0');
			}
			// If character is operator, pop most recent two elements from stack/apply operator
			else {
				int value1 = valueStack.pop();
				int value2 = valueStack.pop();
				// switch statement evaluates operands based on operator, pushes result to stack
				switch(character) {
				case '+':
					valueStack.push(value2+value1);
					break;
				case '-':
					valueStack.push(value2-value1);
					break;
				case '/':
					valueStack.push(value2/value1);
					break;
				case '*':
					valueStack.push(value2*value1);
					break;
				}
			}
		}
		return valueStack.pop();	
	}
	
	public static void main (String[] args) {
		
		String postfix1 = "12+4*5-";
		System.out.println("Postfix 12+4*5- evaluates to: " +evaluatePostfix(postfix1));
		
		String postfix2 = "12*4*1-/53*+";
		System.out.println("Postfix 12*4*1-/53*+ evaluates to: " +evaluatePostfix(postfix2));
	}
}
