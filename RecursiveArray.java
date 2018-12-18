package recursion;

/**
 * Program that prints reversed specified portion of array via recursion
 * @author Brenton Otis
 */

public class RecursiveArray {
	
	/**Method reverses array using recursion
	 * @param array array to reverse
	 * @param first first element to consider
	 * @param last last element to consider */
	static void reverseArray(int array[], int first, int last) {
		
		// starts by printing array at index of last
		System.out.print(array[last] + " ");
		// until first is not last (if first < last), recursively calls itself
		if (first < last) {
			reverseArray(array, first, --last);
		}
	}
}

