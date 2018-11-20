package bags;

/**
 * Test class verifying add() and toArry() methods of ArrayBag class/BagInterface
 * @author Brenton Otis c/o Frank M. Carrano, Timothy M. Henry
 */

public class ArrayBagDemo {
	public static void main (String[] args) {
		
		// adding to empty bag with ample capacity
		System.out.println("Testing empty bag with ample capacity");
		BagInterface<String> aBag = new ArrayBag<>();
		String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
		testAdd(aBag, contentsOfBag1);
		
		// adding to empty bag past capacity
		System.out.println("\nTesting empty bag past capacity");
		aBag = new ArrayBag<>(7);
		String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "last_string"};
		testAdd(aBag, contentsOfBag2);
	}
	
	// method to test add() method of ArrayBag class
	private static void testAdd(BagInterface<String> aBag, String[] content) {
		System.out.print("Adding string to bag: ");
		for (int index = 0; index < content.length; index++) {
			if (aBag.add(content[index])) {
				System.out.print(content[index] + " ");
			}
			else {
				System.out.print("\nUnable to add " + content[index] + " to bag.");
			}
			System.out.println();
			displayBag(aBag);
		}
	}
	
	// tests method toArray by displaying bag
	private static void displayBag(BagInterface<String> aBag) {
		System.out.print("Bag contains the following strings: ");
		Object[] bagArray = aBag.toArray();
		for (int index = 0; index < bagArray.length; index++) {
			System.out.print(bagArray[index] + " ");
		}
		System.out.println();
	}	
}
