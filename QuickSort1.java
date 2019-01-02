package sorting_algorithms;

/**
 * Example of quick sort algorithm
 * Uses last element as pivot point
 * @author Brenton Otis
 */

import java.util.Arrays;

public class QuickSort1 {
	
	/**Partition method chooses pivot point and sorts array around pivot
	 * @param anArray array to be sorted
	 * @param start beginning of array
	 * @param end end of array
	 * @return final position of pivot value */
	private static int partition(int anArray[], int start, int end) {
		//selects/initializes pivot point as last element
		int pivot = anArray[end];
		//initializes counter as 0 (or 1 less than array start)
		int i = (start - 1);
		// iterates through array
		for (int j = start; j < end; j++) {
			// if element less than/equal to pivot, swaps before pivot value
			if (anArray[j] <= pivot) {
				i++;	
				int temp = anArray[i];
				anArray[i] = anArray[j];
				anArray[j] = temp;
			}
		}
		// otherwise places element at end of array
		int temp = anArray[i + 1];
		anArray[i + 1] = anArray[end];
		anArray[end] = temp;
		// returns final sorted position of pivot
		return i + 1;
	}
	
	/**Checks indices and recursively sorts so long as elements remain to be sorted
	 * @param anArray array to be sorted
	 * @param start start of array
	 * @param end end of array */
	public static void quickSort (int anArray[], int start, int end) {
		// if remains section of array to be sorted, partition/sort
		if (start < end) {
			int pivotPoint = partition(anArray, start, end);
			// recursively quick sort both partitions
			quickSort(anArray, start, pivotPoint - 1);
			quickSort(anArray, pivotPoint + 1, end);
		}
	}
	
	// driver
	public static void main (String[] args) {
		int[] myArray = {1,6,9,8,3,2,5,4,10,7};
		System.out.println("Unsorted: " + Arrays.toString(myArray));
		quickSort(myArray, myArray.length - myArray.length, myArray.length-1);
		System.out.println("Sorted: " + Arrays.toString(myArray));	
	}
}
