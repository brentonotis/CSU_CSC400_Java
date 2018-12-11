package stacks3;

/** 
 * Tests the method evaluatePostfix from PostfixCalculator
 * @author Brenton Otis
 */

public class PostfixDemo extends PostfixCalculator {
	
	public static boolean isTrue = false;

	/**
	 * Tests whether evaluatePostfix method is accurate
	 * @param postfix postfix expression to be evaluated
	 * @param result what the result of the postfix eval. should be
	 */
	private static void testPostfixEval(String postfix, int result) {
		
		if (evaluatePostfix(postfix) == result) {
			isTrue = true;
		}
		else {
			isTrue = false;
		}
	}
	
	public static void main (String[] args) {
		
		System.out.println("Testing with expression 12+4*5- and accurate result of 7");
		testPostfixEval("12+4*5-", 7);
		System.out.println("Is postfix evaluation accurate? " + isTrue);
		System.out.println("----------------------------------------------------------");
		System.out.println("Testing with expression 12+4*5- and inaccurate result of 8");
		testPostfixEval("12+4*5-", 8);
		System.out.println("Is postfix evaluation accurate? " + isTrue);	
	}
}
