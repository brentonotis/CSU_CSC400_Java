package generics;

/**
 * Example of generic methods, bounded type parameters & a wildcard
 * @author Brenton Otis
 */

public class GenericMethodEx {
	
	// displays array of generic type (<T>)
	public static <T> void displayArray(T[] myArray) {
		
		for (T arrayEntry : myArray) {
			System.out.print(arrayEntry);
			System.out.print(" ");
		} // end for
		System.out.println(); // end displayArray
	}
	
	// <T extends Comparable <T>> bounds T to represent class types that provide the compareTo method
	// '?' represents any class type, '? super T' means any superclass of T
	// '? super T' allows comparisons to objects of superclass of T (instead of only explicit objects of T)
	public static <T extends Comparable<? super T>> void arrayMinimum(T[] anArray) {
		
		T minimum = anArray[0];
		for (T arrayEntry: anArray) {
			if (arrayEntry.compareTo(minimum) < 0) {
				minimum = arrayEntry;
			}
		}
		return;
	}
	
	// driver
	public static void main (String[] args) {
		
		String[] stringArray = {"alpha", "beta", "gamma", "delta"};
		System.out.print("stringArray is: ");
		displayArray(stringArray);
		
		Character[] characterArray = {'A', 'B', 'C', 'D'};
		System.out.print("characterArray is: ");
		displayArray(characterArray);
		
		Integer[] integerArray = {1, 2, 3, 4};
		System.out.print("integerArray is: ");
		displayArray(integerArray);
	}
}
