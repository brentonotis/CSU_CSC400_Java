package sorting_algorithms;

/**
 * Example of recursive Merge Sort Algorithm of int[] array
 * Work in progress, not successfully functioning as intended
 * Arrays.sort() works just fine though :)
 * @author Brenton Otis
 */

import java.util.Arrays;

public class MergeSort {
	
	/**Recursively divides array into sub-arrays and sorts
	 * @param array array being evaluated
	 * @param length length of array */
	public static void mergeSort(int[] array, int length) {
		// checks to see if array has more than one element; returns if so
		if (length < 2) {
			return;
		}
		// gets/sets middle index and creates two temp. sub-arrays
		int mid = length / 2;
		int[] sub1 = new int[mid];
		int[] sub2 = new int[length - mid];
		// iterates through first half of array, fills sub-array 1
		for (int i = 0; i < mid; i++) {
			sub1[i] = array[i];
		}
		// iterates through second half of array, fills sub-array 2
		for (int i = mid; i < length; i++) {
			sub2[i - mid] = array[i];
		}
		// recursively continues pattern (until length < 2)
		mergeSort(sub1, mid);
		mergeSort(sub2, length - mid);
		// calls merge() method (defined below) to merge sorted sub-arrays
		merge(array, sub1, sub2, mid, length - mid);
	}
	
	/**Compares elements of sub-arrays and places smallest element into main array
	 * @param array main array being evaluated
	 * @param sub1 first sub-array
	 * @param sub2 second sub-array
	 * @param left starting index of first sub-array
	 * @param right starting index of second sub-array */
	public static void merge(int[] array, int[] sub1, int[] sub2, int left, int right) {
		// set initial indices to 0
		int i = 0;
		int j = 0;
		int k = 0;
		// while both indices being evaluated are less than length of sub-array
		while(i < left && j < right) {
			// if left index less than/equal to right, place value into main array
			// otherwise place right value into main array
			if (sub1[i] <= sub2[i]) {
				array[k++] = sub1[i++];
			}
			else {
				array[k++] = sub2[j++];
			}
		}
		// while i index less than length of left sub-array
		// place sub-array1 index into array
		while(i < left) {
			array[k++] = sub1[i++]; 
		}
		// while j index less than length of right sub-array
		// place sub-array2 index into array
		while(j < right) {
			array[k++] = sub2[j++];
		}
	}
	
	// driver
	public static void main (String[] args) {
		
		// example of built-in Arrays.sort() method
		// when statically sorting array of objects, uses merge sort
		int[] array = {6,3,1,9,4,8,5};
		System.out.println("Unsorted: " + Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("Sorted: " + Arrays.toString(array));
		
		// example of mergeSort() method as implemented above
		int[] array2 = {5,9,1,6,3,8,2};
		System.out.println("Unsorted: " + Arrays.toString(array2));	
		mergeSort(array2, array2.length);
		System.out.println("Sorted: " + Arrays.toString(array2));
	}
}
