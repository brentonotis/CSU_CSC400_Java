package stacks3;

/**
 * Program that reads postfix expression and evaluates/returns result
 * Takes in 5 data points for use in two pre-determined expressions per assignment spec.
 * @author Brenton Otis
 */

import java.util.*;

public class PostfixCalculator {

	public static int evaluatePostfix(String postfix) {
		
		// try/catch to catch EmptyStackException
		try {
			Stack<Integer> valueStack = new Stack<Integer>();
			int characterCount = postfix.length();
			int index = 0;
			char nextChar = ' ';
			int operandTwo, operandOne, result;
			
			// read through all characters in expression, assign to nextChar variable
			for (index = 0; index < characterCount; index++){
				nextChar = postfix.charAt(index);
				
				// if character is operand, push to stack
				if (Character.isDigit(nextChar)) {
					String s = Character.toString(nextChar);
					valueStack.push(Integer.parseInt(s));
				}
				// else if statements evaluate operators
				// pop most recent values/operands from stack & apply operator
				// push result back to stack
				else if (nextChar=='+') {     
					operandTwo = valueStack.pop();
					operandOne = valueStack.pop();
					result = operandOne + operandTwo;
					valueStack.push((Integer) result);
				}
				else if (nextChar =='-') {
					operandTwo = valueStack.pop();
					operandOne = valueStack.pop();
					result = operandOne - operandTwo;
					valueStack.push((Integer) result);
				}
				else if (nextChar=='*') {
					operandTwo = valueStack.pop();
					operandOne = valueStack.pop();
					result = operandOne * operandTwo;
					valueStack.push((Integer) result);
				}
				else if (nextChar=='/') {
					operandTwo = valueStack.pop();
					operandOne = valueStack.pop();
					result = operandOne / operandTwo;
					valueStack.push((Integer) result);
				}

				else {
					return 0;
				}
			}
			return valueStack.peek();  
		}
		catch(EmptyStackException e) {
			return -1; 
		}
	}
	
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		
		// ask user for five integer values, assign to variables
		System.out.println("Please enter your first integer: ");
		int data1= Integer.parseInt(scnr.nextLine());
		System.out.println("Please enter your second integer: ");
		int data2= Integer.parseInt(scnr.nextLine());
		System.out.println("Please enter your third integer: ");
		int data3= Integer.parseInt(scnr.nextLine());
		System.out.println("Please enter your fourth integer: ");
		int data4= Integer.parseInt(scnr.nextLine());
		System.out.println("Please enter your fifth integer: ");
		int data5= Integer.parseInt(scnr.nextLine());
		
		// builds string/expression of data values in line with assignment spec
		// data1 data2 + data3 * data4 -
		String expression1 = String.valueOf(data1) + String.valueOf(data2) + "+" + String.valueOf(data3) + "*"
			+ String.valueOf(data4) + "-";
		
		// prints expression + evaluation via evaluatePostfix method
		System.out.println("data1 data2 + data3 * data4 - evaluates to: "+ evaluatePostfix(expression1));
		
		// builds data1 data2 * data3 * data1 -/ data4 data5 *+
		String expression2 = String.valueOf(data1) + String.valueOf(data2) + "*" + String.valueOf(data3) + "*"
			+ String.valueOf(data1) + "-" + "/" + String.valueOf(data4) + String.valueOf(data5) + "*" + "+";
		
		// prints expression + evaluation via evaluatePostifix method
		System.out.println("data1 data2 * data3 * data1 - / data4 data5 * + evaluates to: " + evaluatePostfix(expression2));
	}
}
