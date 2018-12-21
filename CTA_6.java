package sorting_algorithms;

import java.util.Arrays;

public class CTA_6 {

	/**Sorts an array of integers via selection sort
	 * Sorts iteratively in ascending order
	 * @param anArray array to sort */
	private static void selectionSortAsc (int[] anArray) {
		// loop through array, set minimum to i
		for (int i = 0; i < anArray.length - 1; ++i) {
			int minimum = i;
			// inner-loop evaluates subsequent elements in array
			for (int j = i + 1; j < anArray.length; ++j) {
				// if next element less than minimum (i), set to new minimum
				if (anArray[j] < anArray[minimum]) {
					minimum = j;
				}
			}
			// swap smallest value (minimum) with element i
			int placeholder = anArray[i];
			anArray[i] = anArray[minimum];
			anArray[minimum] = placeholder;
			System.out.println(Arrays.toString(anArray));
		}
	}
	
	/**Sorts an array of integers via selection sort
	 * Sorts iteratively in descending order
	 * @param anArray array to sort */
	private static void selectionSortDesc (int[] anArray) {
		// loop through array, set minimum to i
		for (int i = 0; i < anArray.length - 1; ++i) {
			int minimum = i;
			// inner-loop evaluates subsequent elements in array
			for (int j = i + 1; j < anArray.length; ++j) {
				// if next element less than minimum (i), set to new minimum
				if (anArray[j] > anArray[minimum]) {
					minimum = j;
				}
			}
			// swap smallest value (minimum) with element i
			int placeholder = anArray[i];
			anArray[i] = anArray[minimum];
			anArray[minimum] = placeholder;
			System.out.println(Arrays.toString(anArray));
		}
	}
	
	public static void main (String[] args) {
		
		int[] myArray = {12, 78, 2, 65, 91, 18, 1, 43};
		System.out.println("Selection sort ascending:");
		selectionSortAsc(myArray);
		System.out.println();
		System.out.println("Selection sort descending:");
		selectionSortDesc(myArray);
	}
}
