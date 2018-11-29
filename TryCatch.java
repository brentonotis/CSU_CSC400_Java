package exceptions;

/**
 * Simple example of two try/catch blocks
 * one within, one outside of while loop
 */

public class TryCatch {

	public static void main (String[] args) {
	
		// try-catch blocks within body of loop if loop needs to remain active after exception
		// loop within try block if loop needs to end when exception occurs
		
		int a = 0;
		while (a < 20) {
			try {
				if (a == 10)
					throw new Exception();
				else if (a % 2 == 0)
					System.out.println(a + " is even.");
			}
			catch(Exception e) {
				System.out.println("Exception: " + a + " is too large.");
			}
			++a;
		}
		
		System.out.println();
		
		int b = 0;
		try {
			while (b < 20) {
				if (b == 10)
					throw new Exception();
				else if (b % 2 == 0)
					System.out.println(b + " is even.");
				b++;
			}
		}
		catch(Exception e) {
			System.out.println("Exception: " + b + " is too large.");
		}	
	}
}
