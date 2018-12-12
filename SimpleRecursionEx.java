package recursion;

public class SimpleRecursionEx {
	
	/**Counts down from a given positive integer
	 * @param integer integer to start counting from > 0 */
	public static void countDown(int integer) {
		
		// method calls itself while integer greater than 1 (base case)
		System.out.print(integer + " ");
		if (integer > 1) {
			countDown(integer - 1);
		} // end countdown
	}
	
	
	/**Computes sum 1 + 2 + ... + n for any integer > 0
	 * @param n Integer > 0
	 * @return sum */
	public static int sumOf (int n) {
		
		int sum;
		// base case
		if (n == 1) {
			sum = 1;
		}
		// recursive call
		else {
			sum = sumOf(n - 1) + n;
		}
		return sum;
	}
	
	/**Displays the integers in an array
	 * @param array array of integers
	 * @param first the index of the first integer displayed
	 * @param last the index of the last integer displayed
	 * 0 <= first <= last < array.length */
	public static void displayArray(int array[], int first, int last) {
		
		System.out.print(array[first] + " ");
		// base case
		if (first < last) {
			displayArray(array, first + 1, last);
		}
	}
	
	// driver
	public static void main (String[] args) {
		
		countDown(10); // should count down from 10 to 1
		System.out.println();
		System.out.println(sumOf(10)); // should return/print 55
		int[] myArray = new int[] {1,2,3};
		displayArray(myArray, 0, 2); // should print 1 2 3
	}
}
