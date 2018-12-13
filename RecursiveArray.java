package recursion;

/**
 * Program that reverses array via recursion
 * @author Brenton Otis
 */

import java.util.Arrays;

public class RecursiveArray {
	
	/**Method reverses array using recursion
	 * @param array array to reverse
	 * @param first first element to consider
	 * @param last last element to consider
	 * @return reversed array */
	public static int[]reverseArray(int array[], int first, int last) {
		
		// swap first and last elements of array
		// continue to do so recursively until array is reversed
		if (first < last) {
			int placeHolder = array[first];
			array[first] = array[last];
			array[last] = placeHolder;
			reverseArray(array, first + 1, last - 1);
		}
		return array;
	}
	
	// driver
	public static void main (String[] args) {
		
		int[] myArray = new int[] {1,2,3,4};
		
		System.out.print("Original array: " + Arrays.toString(myArray));
		System.out.println();
		
		int[] reversedArray = reverseArray(myArray, 0, 3);
		
		System.out.print("Reversed array: " + Arrays.toString(reversedArray));
	}
}
