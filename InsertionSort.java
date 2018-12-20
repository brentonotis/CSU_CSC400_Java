package sorting_algorithms;

/**
 * Class for sorting array via insertion sort
 * sorts array of Comparable objects from smallest to largest (recursively)
 * @author Brenton Otis c/o Frank M. Carrano, Timothy M. Henry
 */

public class InsertionSort {

	/** Sorts array entries myArray[first] through myArray[last] recursively
	 * @param myArray array of Comparable objects to be sorted
	 * @param first first index of array to be evaluated
	 * @param last last index of array to be evaluated */
	public static <T extends Comparable<? super T>> void insertionSort(T[] myArray, int first, int last) {
		
		// if array contains more than one entry
		if (first < last) {
			// sort all but last entry
			insertionSort(myArray, first, last - 1);
			// insert last entry in sorted order
			insertInOrder(myArray[last], myArray, first, last - 1);
		}
	}
	/** Inserts anEntry into sorted array entries myArray[begin] through myArray[end]
	 * @param anEntry value to be inserted
	 * @param myArray array being sorted
	 * @param begin first index of array to be evaluated
	 * @param end last index of array to be evaluated */
	private static <T extends Comparable<? super T>> void insertInOrder(T anEntry, T[] myArray, int begin, int end) {
		
		if (anEntry.compareTo(myArray[end]) >= 0) {
			myArray[end + 1] = anEntry;
		}
		else if (begin < end) {
			myArray[end + 1] = myArray[end];
			insertInOrder(anEntry, myArray, begin, end - 1);
		}
		// begin == end and anEntry < myArray[end]
		else {
			myArray[end + 1] = myArray[end];
			myArray[end] = anEntry;
		}
	}
}
