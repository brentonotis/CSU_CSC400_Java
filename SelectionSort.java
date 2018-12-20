package sorting_algorithms;

/**
 * Class for sorting array via selection sort
 * sorts array of Comparable objects from smallest to largest (iteratively)
 * @author Brenton Otis c/o Frank M. Carrano, Timothy M. Henry
 */
public class SelectionSort {
	
	/**Sorts first n objects in an array into ascending order
	 * @param myArray an arry of Comparable objects
	 * @param n an integer > 0 */
	public static <T extends Comparable<? super T>> void selectionSort(T[] myArray, int n) {
		
		// sorts first n entries of array
		for (int index = 0; index < n - 1; ++index) {
			int indexOfNextSmallest = getIndexOfSmallest(myArray, index, n - 1);
			swap(myArray, index, indexOfNextSmallest);
		}
	}
	
	/**Finds index of the smallest value in a portion of an array (myArray)
	 * Precondition: a.length > last >= first >= 0
	 * @param myArray an array of Comparable objects
	 * @param first first index of array to evaluate
	 * @param last last index of array to evaluate
	 * @return index of smallest value */
	private static <T extends Comparable<? super T>> int getIndexOfSmallest(T[] myArray, int first, int last) {
		
		T min = myArray[first];
		int indexOfMin = first;
		for (int index = first + 1; index <= last; ++index) {
			if (myArray[index].compareTo(min) < 0) {
				min = myArray[index];
				indexOfMin = index;
			}
		}
		return indexOfMin;
	}
	
	/**Swaps array entries a[i] and a[j]
	 * @param myArray an array of Comparable objects
	 * @param i one index to swap
	 * @param j other index to swap (with i) */
	private static void swap(Object[] a, int i, int j) {
		
		Object temp = a[i];
		a[i] = a[j];
		a[j] = temp;	
	}
}
