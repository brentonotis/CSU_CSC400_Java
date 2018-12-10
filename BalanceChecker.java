package stacks;

/** Evaluates whether or not the delimiters in an expression are balanced
 * @param expression String to be checked
 * @return True if delimiters are paired correctly
 * @author Brenton Otis c/o Frank M. Carrano, Timothy M. Henry */

public class BalanceChecker {

	public static boolean checkBalance(String expression) {
		
		StackInterface<Character> openDelimiterStack = new LinkedStack<>();
		
		int characterCount = expression.length();
		boolean isBalanced = true;
		int index = 0;
		char nextCharacter = ' ';
		
		while (isBalanced && (index < characterCount)) {
			nextCharacter = expression.charAt(index);
			switch (nextCharacter) {
			case '(': case '[': case '{':
				openDelimiterStack.push(nextCharacter);
				break;
			case ')': case ']': case '}':
				if (openDelimiterStack.isEmpty()) {
					isBalanced = false;
				}
				else {
					char openDelimiter = openDelimiterStack.pop();
					isBalanced = isPaired(openDelimiter, nextCharacter);
				}
				break;
			default: break;
			}
			index++;
		
		}
		if (!openDelimiterStack.isEmpty()) {
			isBalanced = false;
		}
		return isBalanced;
	}	
	// Returns true if given characters, open and close, form pair of parentheses, brackets, or braces
	private static boolean isPaired(char open, char close) {
		return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');		
	}
	
	public static void main (String[] args) {
		 
		String expression = "a {b [c (d + e)/2 - f] + 1}";
		boolean isBalanced = BalanceChecker.checkBalance(expression);
		if (isBalanced) {
			System.out.println(expression + " is balanced");
		}
		else {
			System.out.println(expression + " is not balanced");
		}
	}
}
