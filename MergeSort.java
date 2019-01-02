package sorting_algorithms;

/**
 * Example of recursive merge sort algorithm for array of integers
 * Driver shows result of algorithm below as well as built-in Arrays.sort() method
 * @author Brenton Otis
 */

import java.util.Arrays;

public class MergeSort {
	
	/**Recursively divides array into sub-arrays and sorts
	 * @param mainArray array being evaluated
	 * @param arrayLength length of array */
    public static void mergeSort(int[] mainArray, int arrayLength) {
    	// checks to see if array has more than one element
    	// otherwise doesn't need to divide/sort/merge - so returns
        if (arrayLength < 2)
            return;
        // gets middle index of array
        int mid = arrayLength / 2;
        // creates two new sub-arrays from divided array
        int[] leftArray = new int[mid];
        int[] rightArray = new int[arrayLength - mid];
        // iterates through first half of array, fills sub-array
        for (int i = 0; i < mid; i++) {
            leftArray[i] = mainArray[i];
        }
        // iterates through second half of array, fills second sub-array
        for (int i = mid; i < arrayLength; i++) {
            rightArray[i - mid] = mainArray[i];
        }
        // recursively continues pattern until base case is met (arrayLength < 2)
        mergeSort(leftArray, mid);
        mergeSort(rightArray, arrayLength - mid);
        // calls merge() method (defined below) to sort/merge sub-arrays
        merge(mainArray, leftArray, rightArray, mid, arrayLength - mid);
    }
    
    /**Compares elements of sub-arrays and places smallest element into main array, then merges
	 * @param fullArray main array being evaluated
	 * @param leftArray first sub-array
	 * @param rightArray second sub-array
	 * @param leftLength length of first sub-array
	 * @param rightLength length of second sub-array */
    public static void merge(int[] fullArray, int[] leftArray, int[] rightArray, int leftLength, int rightLength) {
    	// initialize counter indices to 0
        int i = 0; 
        int j = 0;
        int k = 0;
        // sorting operation
        // while both sub-arrays have at least one element
        while (i < leftLength && j < rightLength) {
        	// if left array index less than right array index, put index in full/main array
        	// increment counter index per operation
            if (leftArray[i] <= rightArray[j])
                fullArray[k++] = leftArray[i++];
            // otherwise put right array index into full/main array
            // increment counter index per operation
            else
                fullArray[k++] = rightArray[j++];
        }
        // merge operation
        // while left sub-array has an element, put element(s) from left array into full array
        while (i < leftLength)
            fullArray[k++] = leftArray[i++];
        // while right sub-array has an element, put element(s) from right array into full array
        while (j < rightLength)
            fullArray[k++] = rightArray[j++];
    }
    
    // driver
    public static void main(String[] args) {
    	// demonstrates merge sort algorithm as implemented above
        int[] myArray = {9, 5, 1, 6, 10, 2, 7, 3, 4, 8};
        System.out.println("Merge Sort Algorithm");
        System.out.println("--------------------");
        System.out.println("Unsorted: " + Arrays.toString(myArray));
        mergeSort(myArray, myArray.length);
        System.out.println("Sorted: " + Arrays.toString(myArray));
        System.out.println();
        
        // demonstrates built-in merge sort via Arrays class
        int[] myArray2 = {18, 16, 11, 20, 17, 14, 19, 12, 13, 15};
        System.out.println("Built-in Arrays.sort()");
        System.out.println("----------------------");
        System.out.println("Unsorted: " + Arrays.toString(myArray2));
        Arrays.sort(myArray2);
        System.out.println("Sorted: " + Arrays.toString(myArray2));
    }
}

