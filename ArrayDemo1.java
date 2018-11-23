package array_demos;

import java.util.Arrays;

public class ArrayDemo1 {
	
	public static void main (String[] args) {
		
		// declares array of integers, allocates memory for 3 integers (fixed array)
		int[] myArray = new int[3];
			
		// initializes single element in array
		myArray[0] = 1;
		myArray[1] = 10;
		myArray[2] = 100;
		
		// Arrays.toString() method converts to string, allows for readable printing
		// otherwise, prints className + @ + hex of the hash of memory location
		// i.e.: [I@15db9742
		System.out.println(Arrays.toString(myArray));
		
		// allocate memory for 10 integers in myArray
		myArray = new int[10];
		
		// for loop fills array with integers 1 - 10
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = i + 1; // + 1 to start at 1 (otherwise starts at 0)
		}		
		System.out.println(Arrays.toString(myArray));
		
		// Initializes fixed integer array, allocates memory for 5 integers
		int[] Array_5 = new int[5];
		System.out.println("Fixed array length is " + Array_5.length);		
		
		// Copies array to new array with twice as much space available (*2)
		int Array_10[] = Arrays.copyOf(Array_5, Array_5.length * 2);
		
		System.out.println("New/resized array length is " + Array_10.length);
	}
}
