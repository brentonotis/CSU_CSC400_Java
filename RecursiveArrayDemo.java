package recursion;

import java.util.Arrays;

/** 
 * Tests the method reverseArray for accuracy
 * @author Brenton Otis
 */

public class RecursiveArrayDemo extends RecursiveArray {
	
	// driver
	public static void main (String[] args) {
		
		int myTestArray[] = {1,2,3,4,5,6};
		
		System.out.println("Original array is: " + Arrays.toString(myTestArray));
		System.out.print("Reversed array is: "); reverseArray(myTestArray, 0, 5);
		System.out.println();
		System.out.print("Reversed portion (second half) of array is: "); reverseArray(myTestArray, 0, 2);
		System.out.println();
		System.out.print("Reversed portion (first half) of array is: "); reverseArray(myTestArray, 3, 5);
	}
}
