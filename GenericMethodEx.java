package generics;

/**
 * Example of a generic method (<T> displayArray)
 * @author Brenton Otis
 */

public class GenericMethodEx {

	public static <T> void displayArray(T[] myArray) {
		
		for (T arrayEntry : myArray) {
			System.out.print(arrayEntry);
			System.out.print(" ");
		} // end for
		System.out.println(); // end displayArray
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
