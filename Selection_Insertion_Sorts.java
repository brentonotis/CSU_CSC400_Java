package sorting_algorithms;

import java.util.Arrays;

public class Selection_Insertion_Sorts {
	
	/**Sorts an array of integers via selection sort
	 * Sorts iteratively in ascending order
	 * @param anArray array to sort */
	private static void selectionSorter (int[] anArray) {
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
		}
	}
	
	/**Sorts an array of integers via insertion sort
	 * Sorts iteratively in ascending order
	 * @param anArray array to sort */
	private static void insertionSorter (int[] anArray) {
		// loop through array, set primary to i, set j to i-1
		for (int i = 1; i < anArray.length; ++i) {
			int primary = anArray[i];
			int j = i - 1;
			// while elements greater than primary, move ahead by one position
			while (j >= 0 && anArray[j] > primary) {
				anArray[j + 1] = anArray[j];
				j = j - 1;
			}
			// move primary ahead by 1
			anArray[j + 1] = primary;
		}
	}
	
	// driver
	public static void main (String[] args) {
		
		System.out.println("--------------");
		System.out.println("Selection Sort");
		System.out.println("--------------");
		int[] myArray = {99, 85, 42, 3, 15, 62, 32, 9};
		System.out.println("Unsorted array: " + Arrays.toString(myArray));
		selectionSorter(myArray);
		System.out.println("Sorted array: " + Arrays.toString(myArray));
		
		System.out.println("--------------");
		System.out.println("Insertion Sort");
		System.out.println("--------------");
		int[] myNextArray = {83, 12, 19, 78, 64, 2, 34, 45};
		System.out.println("Unsorted array: " + Arrays.toString(myNextArray));	
		insertionSorter(myNextArray);
		System.out.println("Sorted array: " + Arrays.toString(myNextArray));
	}
}
